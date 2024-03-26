package com.clu.stock.model;

public class StockAnalysisResponse {

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
	
	/**
	 * P/E ratio
	 */
	private String peratio;
	
	/**
	 * Price/Earnings-to-Growth (PEG) Ratio
	 */
	private String pegratio;
	
	private String bookvalue;
	
	/**
	 * Earning per share
	 */
	private String eps;
	
	private String profitmargin;
	
	private String analysttargetprice;

	private String analystratingstrongbuy;

	private String analystratingbuy;

	private String analystratinghold;

	private String analystratingsell;

	private String analystratingstrongsell;

	private String trailingpe;

	private String forwardpe;

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

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getPeratio() {
		return peratio;
	}

	public void setPeratio(String peratio) {
		this.peratio = peratio;
	}

	public String getPegratio() {
		return pegratio;
	}

	public void setPegratio(String pegratio) {
		this.pegratio = pegratio;
	}

	public String getBookvalue() {
		return bookvalue;
	}

	public void setBookvalue(String bookvalue) {
		this.bookvalue = bookvalue;
	}

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public String getProfitmargin() {
		return profitmargin;
	}

	public void setProfitmargin(String profitmargin) {
		this.profitmargin = profitmargin;
	}

	public String getAnalysttargetprice() {
		return analysttargetprice;
	}

	public void setAnalysttargetprice(String analysttargetprice) {
		this.analysttargetprice = analysttargetprice;
	}

	public String getAnalystratingstrongbuy() {
		return analystratingstrongbuy;
	}

	public void setAnalystratingstrongbuy(String analystratingstrongbuy) {
		this.analystratingstrongbuy = analystratingstrongbuy;
	}

	public String getAnalystratingbuy() {
		return analystratingbuy;
	}

	public void setAnalystratingbuy(String analystratingbuy) {
		this.analystratingbuy = analystratingbuy;
	}

	public String getAnalystratinghold() {
		return analystratinghold;
	}

	public void setAnalystratinghold(String analystratinghold) {
		this.analystratinghold = analystratinghold;
	}

	public String getAnalystratingsell() {
		return analystratingsell;
	}

	public void setAnalystratingsell(String analystratingsell) {
		this.analystratingsell = analystratingsell;
	}

	public String getAnalystratingstrongsell() {
		return analystratingstrongsell;
	}

	public void setAnalystratingstrongsell(String analystratingstrongsell) {
		this.analystratingstrongsell = analystratingstrongsell;
	}

	public String getTrailingpe() {
		return trailingpe;
	}

	public void setTrailingpe(String trailingpe) {
		this.trailingpe = trailingpe;
	}

	public String getForwardpe() {
		return forwardpe;
	}

	public void setForwardpe(String forwardpe) {
		this.forwardpe = forwardpe;
	}
	
	
}
