package com.clu.stock.restclient.alphavantage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.clu.stock.model.alphavantage.GlobalQuoteResponse;
import com.google.gson.Gson;

@Service
public class GlobalQuoteRestClient {
	private Logger logger = LoggerFactory.getLogger(GlobalQuoteRestClient.class);
	

	private RestClient restClient;
    
    @Value("${alphavantage.api.key}")
    private String apiKey;

    
    public GlobalQuoteRestClient(RestClient restClient) {
        this.restClient = restClient;
    }
    
	public GlobalQuoteResponse getGlobalQuote(String stockSymbol){

		String stockQuoteJson = restClient.get().uri("/query/?function={FUNCTION}&symbol={symbol}&apikey={apiKey}","GLOBAL_QUOTE", stockSymbol, apiKey).retrieve().body(String.class);
		
		logger.info("stockQuoteJson = " + stockQuoteJson);
		
		Gson gson = new Gson();
	
		// JSON String -> POJO 
		GlobalQuoteResponse globalQuoteResponse = gson.fromJson(stockQuoteJson, GlobalQuoteResponse.class);
		
		return globalQuoteResponse;
		
	}

}
