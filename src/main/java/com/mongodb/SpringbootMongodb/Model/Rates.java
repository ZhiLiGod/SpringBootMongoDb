package com.mongodb.SpringbootMongodb.Model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rates")
public class Rates implements Serializable {
	private static final long serialVersionUID = -8206795251075961228L;
	
	@Id
	private String _id;

	private List<Rate> rates;
	private LocalDateTime date;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public List<Rate> getRate() {
		return rates;
	}
	public void setRate(List<Rate> rate) {
		this.rates = rate;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Rates [_id=" + _id + ", rates=" + rates + ", date=" + date + "]";
	}
	
	@PersistenceConstructor
	public Rates(String _id, List<Rate> rates, LocalDateTime date) {
		this._id = _id;
		this.rates = rates;
		this.date = date;
	}
}
