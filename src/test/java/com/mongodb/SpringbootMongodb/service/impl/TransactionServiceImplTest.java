package com.mongodb.SpringbootMongodb.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.junit4.SpringRunner;

import com.mongodb.SpringbootMongodb.Model.Account;
import com.mongodb.SpringbootMongodb.Model.Transaction;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionServiceImplTest {
	
	@Autowired
	private TransactionServiceImpl transactionServiceImpl;
	
	@Autowired
	private AccountServiceImpl accountServiceImpl;
	
	@Test
	public void testFingByAccountService() throws Exception {
		System.out.println("************************************************************");
        System.out.println("Start Testing");
        System.out.println("************************************************************");
		
		int page = 1;
		int rows = 20;
		Integer deal = 3690;
		String displayName = "Michael Barry Brennan";
		Account acc = accountServiceImpl.queryByDisplayName(displayName);
		List<Transaction> allTrans = transactionServiceImpl.queryByAccount(acc.get_id());
		List<Transaction> transaction = transactionServiceImpl.queryByAccountAndPage(acc.get_id(), page, rows, Direction.ASC);
		List<Transaction> transByDeal = transactionServiceImpl.queryByDeal(deal);
		
		System.out.println("Account is: " + acc.toString() + "Id is: " + acc.get_id());
		transaction.forEach((t) -> System.out.println(t.toString()));
		
		System.out.println("************************************************************");
        System.out.println("End Testing");
        System.out.println("************************************************************");
	}

}
