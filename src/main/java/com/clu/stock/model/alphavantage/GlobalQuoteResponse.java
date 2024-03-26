package com.clu.stock.model.alphavantage;

//import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class GlobalQuoteResponse {

    @SerializedName("Global Quote") 
    public GlobalQuote globalQuote;

	public GlobalQuote getGlobalQuote() {
		return globalQuote;
	}

	public void setGlobalQuote(GlobalQuote globalQuote) {
		this.globalQuote = globalQuote;
	}

	@Override
	public String toString() {
		return "GlobalQuoteResponse [globalQuote=" + globalQuote + "]";
	}
    
    
}
