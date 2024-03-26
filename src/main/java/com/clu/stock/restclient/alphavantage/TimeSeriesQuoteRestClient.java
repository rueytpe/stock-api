package com.clu.stock.restclient.alphavantage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestClient;

import com.clu.stock.model.alphavantage.TimeSeriesMonthlyResponse;
import com.google.gson.Gson;

@Service
public class TimeSeriesQuoteRestClient {

	private Logger logger = LoggerFactory.getLogger(TimeSeriesQuoteRestClient.class);
	
	private RestClient restClient;
    
    @Value("${alphavantage.api.key}")
    private String apiKey;
    
    public TimeSeriesQuoteRestClient(RestClient restClient) {
        this.restClient = restClient;
    }
    
    // http://localhost:8080/time-series?stockSymbol=TSLA
    public TimeSeriesMonthlyResponse getTimeSeriesMonthly(@RequestParam("stockSymbol") String stockSymbol) {
    	
    	String stockQuoteJson =  restClient.get().uri("/query/?function={FUNCTION}&symbol={symbol}&apikey={apiKey}", "TIME_SERIES_MONTHLY", stockSymbol, apiKey ).retrieve().body(String.class);
    	
    	logger.info("stockQuoteJson = " + stockQuoteJson);
    	
    	Gson gson = new Gson();
    	
    	TimeSeriesMonthlyResponse timeSeriesMonthlyResponse = gson.fromJson(stockQuoteJson, TimeSeriesMonthlyResponse.class);
    	
    	return timeSeriesMonthlyResponse;
    	
    }
}
