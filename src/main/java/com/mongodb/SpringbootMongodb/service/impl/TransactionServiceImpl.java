package com.mongodb.SpringbootMongodb.service.impl;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mongodb.SpringbootMongodb.Model.Transaction;
import com.mongodb.SpringbootMongodb.Repository.TransactionRespository;
import com.mongodb.SpringbootMongodb.service.ITransactionService;

@Service
public class TransactionServiceImpl implements ITransactionService {
	
	@Autowired
	private TransactionRespository transactionRespository;
	
	@Override
	public List<Transaction> queryByState(String state) throws Exception {
		return transactionRespository.findByState(state);
	}

	@Override
	public List<Transaction> queryByAccountAndPage(ObjectId account, int page, int rows) throws Exception {
		PageRequest pageRequest = new PageRequest(page - 1, rows); // mongo starts from 0
		// Page<Transaction> pages = transactionRespository.findByAccount(account, pageRequest);
		return transactionRespository.findByAccount(account, pageRequest).getContent();
	}

	@Override
	public List<Transaction> queryAll() throws Exception {
		return transactionRespository.findAll();
	}

	@Override
	public List<Transaction> queryByAccount(ObjectId account) throws Exception {
		return transactionRespository.findByAccount(account);
	}

	@Override
	public List<Transaction> queryByDeal(Integer deal) throws Exception {
		return transactionRespository.findByDeal(deal);
	}
	
}
