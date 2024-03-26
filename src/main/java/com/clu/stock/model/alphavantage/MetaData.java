package com.clu.stock.model.alphavantage;

import com.google.gson.annotations.SerializedName;

//import java.time.LocalDate;

public class MetaData {
	
	@SerializedName("1. Information") 
	private String information;
	
	@SerializedName("2. Symbol") 
	private String symbol;
	
	@SerializedName("3. Last Refreshed") 
	private String lastRefreshed;
	
	@SerializedName("4. Time Zone") 
	private String timeZone;

	public String getInformation() {
		return information;
	}

	public void setInformation(String value) {
		this.information = value;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String value) {
		this.symbol = value;
	}

	public String getLastRefreshed() {
		return lastRefreshed;
	}

	public void setLastRefreshed(String value) {
		this.lastRefreshed = value;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String value) {
		this.timeZone = value;
	}
}