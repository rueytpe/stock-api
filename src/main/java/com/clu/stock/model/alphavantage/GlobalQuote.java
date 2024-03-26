package com.clu.stock.model.alphavantage;

import com.google.gson.annotations.SerializedName;

public class GlobalQuote {
    @SerializedName("01. symbol") 
    public String symbol;
    @SerializedName("02. open") 
    public String open;
    @SerializedName("03. high") 
    public String high;
    @SerializedName("04. low") 
    public String low;
    @SerializedName("05. price") 
    public String price;
    @SerializedName("06. volume") 
    public String volume;
    @SerializedName("07. latest trading day") 
    public String latestTradingDay;
    @SerializedName("08. previous close") 
    public String previousClose;
    @SerializedName("09. change") 
    public String change;
    @SerializedName("10. change percent") 
    public String changePercent;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getLatestTradingDay() {
		return latestTradingDay;
	}
	public void setLatestTradingDay(String latestTradingDay) {
		this.latestTradingDay = latestTradingDay;
	}
	public String getPreviousClose() {
		return previousClose;
	}
	public void setPreviousClose(String previousClose) {
		this.previousClose = previousClose;
	}
	public String getChange() {
		return change;
	}
	public void setChange(String change) {
		this.change = change;
	}
	public String getChangePercent() {
		return changePercent;
	}
	public void setChangePercent(String changePercent) {
		this.changePercent = changePercent;
	}
	@Override
	public String toString() {
		return "GlobalQuote [symbol=" + symbol + ", open=" + open + ", high=" + high + ", low=" + low + ", price="
				+ price + ", volume=" + volume + ", latestTradingDay=" + latestTradingDay + ", previousClose="
				+ previousClose + ", change=" + change + ", changePercent=" + changePercent + "]";
	}
    
    
}
