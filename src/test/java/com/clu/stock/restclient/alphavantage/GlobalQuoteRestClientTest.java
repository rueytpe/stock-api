package com.clu.stock.restclient.alphavantage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.client.MockRestServiceServer;

import com.clu.stock.model.alphavantage.GlobalQuoteResponse;
import com.fasterxml.jackson.databind.ObjectMapper;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RestClientTest(GlobalQuoteRestClient.class)
@ActiveProfiles("test")
class GlobalQuoteRestClientTest {
	
    @Autowired
    MockRestServiceServer server;
    
    @Autowired
    GlobalQuoteRestClient client;
    
    @Autowired
    ObjectMapper objectMapper;
    
    
    @Test
    void shouldGetGlobalQuote() {
   	
    	String url = "https://www.alphavantage.co/query/?function=GLOBAL_QUOTE&symbol=IBM&apikey=demo";
    	String alphaAdvantageResp = "{\n"
    			+ "    \"Global Quote\": {\n"
    			+ "        \"01. symbol\": \"IBM\",\n"
    			+ "        \"02. open\": \"192.0000\",\n"
    			+ "        \"03. high\": \"192.9850\",\n"
    			+ "        \"04. low\": \"190.5100\",\n"
    			+ "        \"05. price\": \"190.8400\",\n"
    			+ "        \"06. volume\": \"3988398\",\n"
    			+ "        \"07. latest trading day\": \"2024-03-22\",\n"
    			+ "        \"08. previous close\": \"191.9000\",\n"
    			+ "        \"09. change\": \"-1.0600\",\n"
    			+ "        \"10. change percent\": \"-0.5524%\"\n"
    			+ "    }\n"
    			+ "}";
        this.server.expect(requestTo(url))
        .andRespond(withSuccess(alphaAdvantageResp, MediaType.APPLICATION_JSON));
        
        GlobalQuoteResponse resp = client.getGlobalQuote("IBM");
        
        assertEquals(resp.getGlobalQuote().getSymbol(), "IBM");
        assertEquals(resp.getGlobalQuote().getPrice(), "190.8400");
    }
    
    
    

}
