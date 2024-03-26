package com.clu.stock.controller;

import java.util.concurrent.CompletableFuture;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clu.stock.model.StockAnalysisResponse;
import com.clu.stock.model.alphavantage.GlobalQuoteResponse;
import com.clu.stock.model.alphavantage.OverviewResponse;
import com.clu.stock.restclient.alphavantage.GlobalQuoteRestClient;
import com.clu.stock.restclient.alphavantage.OverviewRestClient;

@RestController
@RequestMapping("/stock-analysis")
public class StockAnalysisController {
	
	private Logger logger = LoggerFactory.getLogger(StockAnalysisController.class);
	  
	private GlobalQuoteRestClient  globalQuoteService;
	
	private OverviewRestClient overviewService;
	
	public StockAnalysisController(GlobalQuoteRestClient  globalQuoteService, OverviewRestClient overviewService) {
		this.globalQuoteService = globalQuoteService;
		this.overviewService = overviewService;
	}
    
    // http://localhost:8080/stock-quote?stockSymbol=PLTR
    @GetMapping
    public StockAnalysisResponse getStockQuote(@RequestParam("stockSymbol") String stockSymbol) {

    	StockAnalysisResponse stockAnalysisResponse = new StockAnalysisResponse();
    	
		try {

	        CompletableFuture<GlobalQuoteResponse> api1ResponseCompletable  = CompletableFuture.supplyAsync(() ->globalQuoteService.getGlobalQuote(stockSymbol));

	        CompletableFuture<OverviewResponse> api2ResponseCompletable  = CompletableFuture.supplyAsync(() ->overviewService.getOverview(stockSymbol));

	        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(api1ResponseCompletable, api2ResponseCompletable);

	        
	        combinedFuture.join();
	        
	        GlobalQuoteResponse globalQuoteResponse = api1ResponseCompletable.get();
	        OverviewResponse overviewResponse = api2ResponseCompletable.get();
	        
			BeanUtils.copyProperties(stockAnalysisResponse, globalQuoteResponse.getGlobalQuote());
			BeanUtils.copyProperties(stockAnalysisResponse, overviewResponse);
		} catch (Exception e) {
			throw new RuntimeException("Fail to get stock analysis data");
		}

    	
        return stockAnalysisResponse;
    }
}
