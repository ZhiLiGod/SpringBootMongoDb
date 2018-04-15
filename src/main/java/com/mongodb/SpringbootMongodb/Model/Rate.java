package com.mongodb.SpringbootMongodb.Model;

public class Rate {
	private String currency;
	private String rate;
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Rate [currency=" + currency + ", rate=" + rate + "]";
	}
	
	
}
