package com.clu.stock.controller;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clu.stock.model.HistoricalMonthlyQuoteResponse;
import com.clu.stock.model.alphavantage.TimeSeriesEntry;
import com.clu.stock.model.alphavantage.TimeSeriesMonthlyResponse;
import com.clu.stock.restclient.alphavantage.TimeSeriesQuoteRestClient;

@RestController
@RequestMapping("/historicalmonthly")
public class HistoricalMonthlyQuoteController {

	private Logger logger = LoggerFactory.getLogger(HistoricalMonthlyQuoteController.class);

	private TimeSeriesQuoteRestClient timeSeriesQuoteService;
	
	public HistoricalMonthlyQuoteController(TimeSeriesQuoteRestClient timeSeriesQuoteService) {
		this.timeSeriesQuoteService = timeSeriesQuoteService;
	}
	// http://localhost:8080/historicalmonthly?stockSymbol=PLTR&year=2023&month=11
	@GetMapping
	private HistoricalMonthlyQuoteResponse getHistoricalMonthlyQuote(@RequestParam("stockSymbol") String stockSymbol,
			@RequestParam("year") int year, @RequestParam("month") int month) {

		HistoricalMonthlyQuoteResponse historicalMonthlyQuoteResponse = new HistoricalMonthlyQuoteResponse();
		

		try {
			

            CompletableFuture<TimeSeriesMonthlyResponse> api1ResponseCompletable  = CompletableFuture.supplyAsync(() ->timeSeriesQuoteService.getTimeSeriesMonthly(stockSymbol));

            CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(api1ResponseCompletable);

            
            combinedFuture.join();
			
            TimeSeriesMonthlyResponse timeSeriesMonthlyResponse = api1ResponseCompletable.get();
            Map<String, TimeSeriesEntry> timeSeriesEntryMap = timeSeriesMonthlyResponse.getMonthlyTimeSeries();
            String dateString = getTradingDateKey(timeSeriesEntryMap.keySet(), year, month);
            historicalMonthlyQuoteResponse.setDate(dateString);
			TimeSeriesEntry timeSeriesEntry = timeSeriesMonthlyResponse.getMonthlyTimeSeries().get(dateString);
			
			BeanUtils.copyProperties(historicalMonthlyQuoteResponse, timeSeriesEntry);
		} catch (Exception e) {
			throw new RuntimeException("Historical Data not found");
		}

		return historicalMonthlyQuoteResponse;
	}

	private String getTradingDateKey(Set<String> keySet, int year, int month) {

		String dateString = year + "-" + ((month > 9)?month:"0"+month);
		
		if (keySet == null ) {
			return null;
		}
		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {
			String tradingDateStr = itr.next();
			if (tradingDateStr.startsWith(dateString)) {
				return tradingDateStr;
			}
		}

		return null;
	}
}
