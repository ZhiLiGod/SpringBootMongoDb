package com.mongodb.SpringbootMongodb.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Sort.Direction;

import com.mongodb.SpringbootMongodb.Model.Transaction;

public interface ITransactionService {
	public List<Transaction> queryByState(String state) throws Exception;
	
	public List<Transaction> queryByAccountAndPage(ObjectId account, int page, int rows, Direction direction) throws Exception;
	
	public List<Transaction> queryAll() throws Exception;
	
	public List<Transaction> queryByAccount(ObjectId account) throws Exception;
	
	public List<Transaction> queryByDeal(Integer deal) throws Exception;
}
