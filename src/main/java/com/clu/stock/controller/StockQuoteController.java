package com.clu.stock.controller;

import java.util.concurrent.CompletableFuture;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clu.stock.model.StockQuoteResponse;
import com.clu.stock.model.alphavantage.GlobalQuoteResponse;
import com.clu.stock.restclient.alphavantage.GlobalQuoteRestClient;

@RestController
@RequestMapping("/stock-quote")
public class StockQuoteController {
	
	private Logger logger = LoggerFactory.getLogger(StockQuoteController.class);
	  
	private GlobalQuoteRestClient  globalQUoteService;
	
	public StockQuoteController(GlobalQuoteRestClient  globalQUoteService) {
		this.globalQUoteService = globalQUoteService;
	}
    
    // http://localhost:8080/stock-quote?stockSymbol=PLTR
    @GetMapping
    public StockQuoteResponse getStockQuote(@RequestParam("stockSymbol") String stockSymbol) {

        StockQuoteResponse stockQuoteResponse = new StockQuoteResponse();
		try {

	        CompletableFuture<GlobalQuoteResponse> api1ResponseCompletable  = CompletableFuture.supplyAsync(() ->globalQUoteService.getGlobalQuote(stockSymbol));

	        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(api1ResponseCompletable);

	        
	        combinedFuture.join();
	        
	        GlobalQuoteResponse globalQuoteResponse = api1ResponseCompletable.get();
	        
			BeanUtils.copyProperties(stockQuoteResponse, globalQuoteResponse.getGlobalQuote());
		} catch (Exception e) {
			throw new RuntimeException("Fail to get stock quote", e);
		}

    	
        return stockQuoteResponse;
    }

}