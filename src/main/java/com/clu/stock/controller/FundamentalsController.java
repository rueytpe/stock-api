package com.clu.stock.controller;

import java.util.concurrent.CompletableFuture;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clu.stock.model.FundamentalsResponse;
import com.clu.stock.model.alphavantage.OverviewResponse;
import com.clu.stock.restclient.alphavantage.OverviewRestClient;

@RestController
@RequestMapping("/fundamentals")
public class FundamentalsController {
	
	private Logger logger = LoggerFactory.getLogger(FundamentalsController.class);
	
	private OverviewRestClient overviewService;
	
	public FundamentalsController(OverviewRestClient overviewService) {
		this.overviewService = overviewService;
	}
	
	// http://localhost:8080/fundamentals?stockSymbol=PLTR
    @GetMapping
    public FundamentalsResponse getFundamentals(@RequestParam("stockSymbol") String stockSymbol) {

    	
    	FundamentalsResponse fundamentalsResponse = new FundamentalsResponse();
    	
    	try {

            CompletableFuture<OverviewResponse> api1ResponseCompletable  = CompletableFuture.supplyAsync(() ->overviewService.getOverview(stockSymbol));

            CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(api1ResponseCompletable);

            
            combinedFuture.join();
            
            OverviewResponse overviewResponse = api1ResponseCompletable.get();
    		BeanUtils.copyProperties(fundamentalsResponse, overviewResponse);
    	} catch(Exception e) {
    		throw new RuntimeException(e);
    	}
    	
    	return fundamentalsResponse;


    }
    

}
