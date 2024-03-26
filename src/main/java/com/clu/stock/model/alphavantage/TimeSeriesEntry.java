package com.clu.stock.model.alphavantage;

import com.google.gson.annotations.SerializedName;

public class TimeSeriesEntry {
	
	@SerializedName("1. open") 
	private String open;
	
	@SerializedName("2. high") 
	private String high;
	
	@SerializedName("3. low") 
	private String low;
	
	@SerializedName("4. close") 
	private String close;
	
	@SerializedName("5. volume") 
	private String volume;

	public String getOpen() {
		return open;
	}

	public void setOpen(String value) {
		this.open = value;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String value) {
		this.high = value;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String value) {
		this.low = value;
	}

	public String getClose() {
		return close;
	}

	public void setClose(String value) {
		this.close = value;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String value) {
		this.volume = value;
	}
}
