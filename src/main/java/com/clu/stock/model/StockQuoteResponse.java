package com.clu.stock.model;

public class StockQuoteResponse {

	private String symbol;

	private String price;

	private String high;

	private String low;

	private String volume;

	private String latestTradingDate;
	
	private String previousClose;

	private String change;

	private String changePercent;

	private String open;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
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

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getLatestTradingDate() {
		return latestTradingDate;
	}

	public void setLatestTradingDate(String latestTradingDate) {
		this.latestTradingDate = latestTradingDate;
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

	public void setChangePercent(String chantePercent) {
		this.changePercent = chantePercent;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getPreviousClose() {
		return previousClose;
	}

	public void setPreviousClose(String previousClose) {
		this.previousClose = previousClose;
	}

	
}
