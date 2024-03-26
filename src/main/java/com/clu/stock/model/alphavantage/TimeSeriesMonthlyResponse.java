package com.clu.stock.model.alphavantage;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class TimeSeriesMonthlyResponse {
	
	@SerializedName("Meta Data") 
	private MetaData metaData;
	
	@SerializedName("Monthly Time Series") 
	private Map<String, TimeSeriesEntry> monthlyTimeSeries;

	public MetaData getMetaData() {
		return metaData;
	}

	public void setMetaData(MetaData value) {
		this.metaData = value;
	}

	public Map<String, TimeSeriesEntry> getMonthlyTimeSeries() {
		return monthlyTimeSeries;
	}

	public void setMonthlyTimeSeries(Map<String, TimeSeriesEntry> value) {
		this.monthlyTimeSeries = value;
	}
}