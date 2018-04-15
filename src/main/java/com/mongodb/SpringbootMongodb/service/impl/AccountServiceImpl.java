package com.mongodb.SpringbootMongodb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.SpringbootMongodb.Model.Account;
import com.mongodb.SpringbootMongodb.Repository.AccountRepository;
import com.mongodb.SpringbootMongodb.service.IAccountService;

@Service
public class AccountServiceImpl implements IAccountService {
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public Account queryByDisplayName(String displayName) throws Exception {
		return accountRepository.findByDisplayName(displayName);
	}
	
}
