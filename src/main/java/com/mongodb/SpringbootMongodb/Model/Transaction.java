package com.mongodb.SpringbootMongodb.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transactions")
public class Transaction implements Serializable {
	private static final long serialVersionUID = -1204368933579373172L;
	
	@Id
	private String _id;
	private String description;
	private String currency;
	private String account;
	private Integer deal;
	private String state;
	private Double amount;
	private LocalDateTime date;
	private String type;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Integer getDeal() {
		return deal;
	}
	public void setDeal(Integer deal) {
		this.deal = deal;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@PersistenceConstructor
	public Transaction(String _id, String description, String currency, String account, Integer deal, String state,
			Double amount, LocalDateTime date, String type) {
		this._id = _id;
		this.description = description;
		this.currency = currency;
		this.account = account;
		this.deal = deal;
		this.state = state;
		this.amount = amount;
		this.date = date;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Transaction [_id=" + _id + ", description=" + description + ", currency=" + currency + ", account="
				+ account + ", deal=" + deal + ", state=" + state + ", amount=" + amount + ", date=" + date + ", type="
				+ type + "]";
	}
}
