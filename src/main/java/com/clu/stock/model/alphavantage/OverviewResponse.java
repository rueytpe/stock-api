package com.clu.stock.model.alphavantage;

import com.google.gson.annotations.SerializedName;

public class OverviewResponse {

	@SerializedName("Symbol")
	private String symbol;

	@SerializedName("AssetType")
	private String assettype;

	@SerializedName("Name")
	private String name;

	@SerializedName("Description")
	private String description;

	@SerializedName("CIK")
	private String cik;

	@SerializedName("Exchange")
	private String exchange;

	@SerializedName("Currency")
	private String currency;

	@SerializedName("Country")
	private String country;

	@SerializedName("Sector")
	private String sector;

	@SerializedName("Industry")
	private String industry;

	@SerializedName("Address")
	private String address;

	@SerializedName("FiscalYearEnd")
	private String fiscalyearend;

	@SerializedName("LatestQuarter")
	private String latestquarter;

	@SerializedName("MarketCapitalization")
	private String marketcapitalization;

	@SerializedName("EBITDA")
	private String ebitda;

	@SerializedName("PERatio")
	private String peratio;

	@SerializedName("PEGRatio")
	private String pegratio;

	@SerializedName("BookValue")
	private String bookvalue;

	@SerializedName("DividendPerShare")
	private String dividendpershare;

	@SerializedName("DividendYield")
	private String dividendyield;

	@SerializedName("EPS")
	private String eps;

	@SerializedName("RevenuePerShareTTM")
	private String revenuepersharettm;

	@SerializedName("ProfitMargin")
	private String profitmargin;

	@SerializedName("OperatingMarginTTM")
	private String operatingmarginttm;

	@SerializedName("ReturnOnAssetsTTM")
	private String returnonassetsttm;

	@SerializedName("ReturnOnEquityTTM")
	private String returnonequityttm;

	@SerializedName("RevenueTTM")
	private String revenuettm;

	@SerializedName("GrossProfitTTM")
	private String grossprofitttm;

	@SerializedName("DilutedEPSTTM")
	private String dilutedepsttm;

	@SerializedName("QuarterlyEarningsGrowthYOY")
	private String quarterlyearningsgrowthyoy;

	@SerializedName("QuarterlyRevenueGrowthYOY")
	private String quarterlyrevenuegrowthyoy;

	@SerializedName("AnalystTargetPrice")
	private String analysttargetprice;

	@SerializedName("AnalystRatingStrongBuy")
	private String analystratingstrongbuy;

	@SerializedName("AnalystRatingBuy")
	private String analystratingbuy;

	@SerializedName("AnalystRatingHold")
	private String analystratinghold;

	@SerializedName("AnalystRatingSell")
	private String analystratingsell;

	@SerializedName("AnalystRatingStrongSell")
	private String analystratingstrongsell;

	@SerializedName("TrailingPE")
	private String trailingpe;

	@SerializedName("ForwardPE")
	private String forwardpe;

	@SerializedName("PriceToSalesRatioTTM")
	private String pricetosalesratiottm;

	@SerializedName("PriceToBookRatio")
	private String pricetobookratio;

	@SerializedName("EVToRevenue")
	private String evtorevenue;

	@SerializedName("EVToEBITDA")
	private String evtoebitda;

	@SerializedName("Beta")
	private String beta;

	@SerializedName("52WeekHigh")
	private String the52weekhigh;

	@SerializedName("52WeekLow")
	private String the52weeklow;

	@SerializedName("50DayMovingAverage")
	private String the50daymovingaverage;

	@SerializedName("200DayMovingAverage")
	private String the200daymovingaverage;

	@SerializedName("SharesOutstanding")
	private String sharesoutstanding;

	@SerializedName("DividendDate")
	private String dividenddate;

	@SerializedName("ExDividendDate")
	private String exdividenddate;

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setAssettype(String assettype) {
		this.assettype = assettype;
	}

	public String getAssettype() {
		return assettype;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setCik(String cik) {
		this.cik = cik;
	}

	public String getCik() {
		return cik;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getExchange() {
		return exchange;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getSector() {
		return sector;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getIndustry() {
		return industry;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setFiscalyearend(String fiscalyearend) {
		this.fiscalyearend = fiscalyearend;
	}

	public String getFiscalyearend() {
		return fiscalyearend;
	}

	public void setLatestquarter(String latestquarter) {
		this.latestquarter = latestquarter;
	}

	public String getLatestquarter() {
		return latestquarter;
	}

	public void setMarketcapitalization(String marketcapitalization) {
		this.marketcapitalization = marketcapitalization;
	}

	public String getMarketcapitalization() {
		return marketcapitalization;
	}

	public void setEbitda(String ebitda) {
		this.ebitda = ebitda;
	}

	public String getEbitda() {
		return ebitda;
	}

	public void setPeratio(String peratio) {
		this.peratio = peratio;
	}

	public String getPeratio() {
		return peratio;
	}

	public void setPegratio(String pegratio) {
		this.pegratio = pegratio;
	}

	public String getPegratio() {
		return pegratio;
	}

	public void setBookvalue(String bookvalue) {
		this.bookvalue = bookvalue;
	}

	public String getBookvalue() {
		return bookvalue;
	}

	public void setDividendpershare(String dividendpershare) {
		this.dividendpershare = dividendpershare;
	}

	public String getDividendpershare() {
		return dividendpershare;
	}

	public void setDividendyield(String dividendyield) {
		this.dividendyield = dividendyield;
	}

	public String getDividendyield() {
		return dividendyield;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public String getEps() {
		return eps;
	}

	public void setRevenuepersharettm(String revenuepersharettm) {
		this.revenuepersharettm = revenuepersharettm;
	}

	public String getRevenuepersharettm() {
		return revenuepersharettm;
	}

	public void setProfitmargin(String profitmargin) {
		this.profitmargin = profitmargin;
	}

	public String getProfitmargin() {
		return profitmargin;
	}

	public void setOperatingmarginttm(String operatingmarginttm) {
		this.operatingmarginttm = operatingmarginttm;
	}

	public String getOperatingmarginttm() {
		return operatingmarginttm;
	}

	public void setReturnonassetsttm(String returnonassetsttm) {
		this.returnonassetsttm = returnonassetsttm;
	}

	public String getReturnonassetsttm() {
		return returnonassetsttm;
	}

	public void setReturnonequityttm(String returnonequityttm) {
		this.returnonequityttm = returnonequityttm;
	}

	public String getReturnonequityttm() {
		return returnonequityttm;
	}

	public void setRevenuettm(String revenuettm) {
		this.revenuettm = revenuettm;
	}

	public String getRevenuettm() {
		return revenuettm;
	}

	public void setGrossprofitttm(String grossprofitttm) {
		this.grossprofitttm = grossprofitttm;
	}

	public String getGrossprofitttm() {
		return grossprofitttm;
	}

	public void setDilutedepsttm(String dilutedepsttm) {
		this.dilutedepsttm = dilutedepsttm;
	}

	public String getDilutedepsttm() {
		return dilutedepsttm;
	}

	public void setQuarterlyearningsgrowthyoy(String quarterlyearningsgrowthyoy) {
		this.quarterlyearningsgrowthyoy = quarterlyearningsgrowthyoy;
	}

	public String getQuarterlyearningsgrowthyoy() {
		return quarterlyearningsgrowthyoy;
	}

	public void setQuarterlyrevenuegrowthyoy(String quarterlyrevenuegrowthyoy) {
		this.quarterlyrevenuegrowthyoy = quarterlyrevenuegrowthyoy;
	}

	public String getQuarterlyrevenuegrowthyoy() {
		return quarterlyrevenuegrowthyoy;
	}

	public void setAnalysttargetprice(String analysttargetprice) {
		this.analysttargetprice = analysttargetprice;
	}

	public String getAnalysttargetprice() {
		return analysttargetprice;
	}

	public void setAnalystratingstrongbuy(String analystratingstrongbuy) {
		this.analystratingstrongbuy = analystratingstrongbuy;
	}

	public String getAnalystratingstrongbuy() {
		return analystratingstrongbuy;
	}

	public void setAnalystratingbuy(String analystratingbuy) {
		this.analystratingbuy = analystratingbuy;
	}

	public String getAnalystratingbuy() {
		return analystratingbuy;
	}

	public void setAnalystratinghold(String analystratinghold) {
		this.analystratinghold = analystratinghold;
	}

	public String getAnalystratinghold() {
		return analystratinghold;
	}

	public void setAnalystratingsell(String analystratingsell) {
		this.analystratingsell = analystratingsell;
	}

	public String getAnalystratingsell() {
		return analystratingsell;
	}

	public void setAnalystratingstrongsell(String analystratingstrongsell) {
		this.analystratingstrongsell = analystratingstrongsell;
	}

	public String getAnalystratingstrongsell() {
		return analystratingstrongsell;
	}

	public void setTrailingpe(String trailingpe) {
		this.trailingpe = trailingpe;
	}

	public String getTrailingpe() {
		return trailingpe;
	}

	public void setForwardpe(String forwardpe) {
		this.forwardpe = forwardpe;
	}

	public String getForwardpe() {
		return forwardpe;
	}

	public void setPricetosalesratiottm(String pricetosalesratiottm) {
		this.pricetosalesratiottm = pricetosalesratiottm;
	}

	public String getPricetosalesratiottm() {
		return pricetosalesratiottm;
	}

	public void setPricetobookratio(String pricetobookratio) {
		this.pricetobookratio = pricetobookratio;
	}

	public String getPricetobookratio() {
		return pricetobookratio;
	}

	public void setEvtorevenue(String evtorevenue) {
		this.evtorevenue = evtorevenue;
	}

	public String getEvtorevenue() {
		return evtorevenue;
	}

	public void setEvtoebitda(String evtoebitda) {
		this.evtoebitda = evtoebitda;
	}

	public String getEvtoebitda() {
		return evtoebitda;
	}

	public void setBeta(String beta) {
		this.beta = beta;
	}

	public String getBeta() {
		return beta;
	}

	public void setSharesoutstanding(String sharesoutstanding) {
		this.sharesoutstanding = sharesoutstanding;
	}

	public String getSharesoutstanding() {
		return sharesoutstanding;
	}

	public void setDividenddate(String dividenddate) {
		this.dividenddate = dividenddate;
	}

	public String getDividenddate() {
		return dividenddate;
	}

	public void setExdividenddate(String exdividenddate) {
		this.exdividenddate = exdividenddate;
	}

	public String getExdividenddate() {
		return exdividenddate;
	}

	public String getThe52weekhigh() {
		return the52weekhigh;
	}

	public void setThe52weekhigh(String the52weekhigh) {
		this.the52weekhigh = the52weekhigh;
	}

	public String getThe52weeklow() {
		return the52weeklow;
	}

	public void setThe52weeklow(String the52weeklow) {
		this.the52weeklow = the52weeklow;
	}

	public String getThe50daymovingaverage() {
		return the50daymovingaverage;
	}

	public void setThe50daymovingaverage(String the50daymovingaverage) {
		this.the50daymovingaverage = the50daymovingaverage;
	}

	public String getThe200daymovingaverage() {
		return the200daymovingaverage;
	}

	public void setThe200daymovingaverage(String the200daymovingaverage) {
		this.the200daymovingaverage = the200daymovingaverage;
	}

}
