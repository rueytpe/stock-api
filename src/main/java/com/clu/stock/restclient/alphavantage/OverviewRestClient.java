package com.clu.stock.restclient.alphavantage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestClient;

import com.clu.stock.model.alphavantage.OverviewResponse;
import com.google.gson.Gson;

@Service
public class OverviewRestClient {
	private Logger logger = LoggerFactory.getLogger(GlobalQuoteRestClient.class);
	
	private RestClient restClient;
    
    @Value("${alphavantage.api.key}")
    private String apiKey;
    
    public OverviewRestClient(RestClient restClient) {
        this.restClient = restClient;
    }
    
    public OverviewResponse getOverview(@RequestParam("stockSymbol") String stockSymbol) {
    	
    	String fundamentalsJson =  restClient.get().uri("/query/?function={FUNCTION}&symbol={symbol}&apikey={apiKey}", "OVERVIEW", stockSymbol, apiKey).retrieve().body(String.class);
    	logger.info("fundamentalsJson = " + fundamentalsJson);
    	
    	Gson gson = new Gson();
    	
    	OverviewResponse overviewResponse = gson.fromJson(fundamentalsJson, OverviewResponse.class);
    	return overviewResponse;
    }

}
