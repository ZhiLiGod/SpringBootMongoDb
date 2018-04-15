package com.mongodb.SpringbootMongodb.Repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mongodb.SpringbootMongodb.Model.Account;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountRepositoryTest {
	@Autowired
	private AccountRepository accountRepostory;
	
	@Test
	public void testFindAll() {
		System.out.println("************************************************************");
        System.out.println("Start Testing");
        System.out.println("************************************************************");
        
        List<Account> accounts = accountRepostory.findAll();
        
        for(Account acc : accounts) {
        	System.out.println(acc.getDisplayName() + " " + acc.getReference());
        }
        
        System.out.println("************************************************************");
        System.out.println("End Testing");
        System.out.println("************************************************************");
	}

}
