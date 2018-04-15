package com.mongodb.SpringbootMongodb.service;

import com.mongodb.SpringbootMongodb.Model.Account;

public interface IAccountService {
	public Account queryByDisplayName(String displayName) throws Exception;
}
