package com.mongodb.SpringbootMongodb.Repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mongodb.SpringbootMongodb.Model.Transaction;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionRespositoryTest {
	
	@Autowired
	private TransactionRespository transactionRespository;
	
	@Test
	public void testFindAll() throws Exception {
		System.out.println("************************************************************");
        System.out.println("Start Testing");
        System.out.println("************************************************************");
        
        List<Transaction> transaction = transactionRespository.findAll();
        System.out.println("The length is: " + transaction.size());
        
        List<Transaction> appliedTransactions = transactionRespository.findByState("pending");
        System.out.println("The length is: " + appliedTransactions.size());
        
        System.out.println("************************************************************");
        System.out.println("End Testing");
        System.out.println("************************************************************");
	}

}
