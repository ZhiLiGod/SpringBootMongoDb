package com.mongodb.SpringbootMongodb.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mongodb.SpringbootMongodb.Model.Transaction;
import com.mongodb.SpringbootMongodb.service.impl.TransactionServiceImpl;

@Controller
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionServiceImpl transactionServiceImpl;
	
	@GetMapping("/all")
	public @ResponseBody List<Transaction> getAllTransactions() throws Exception {
		return transactionServiceImpl.queryAll();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody List<Transaction> getTransationsByAccount(@PathVariable("id") ObjectId account) throws Exception {
		return transactionServiceImpl.queryByAccount(account);
	}
	
}
