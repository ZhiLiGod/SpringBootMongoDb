package com.mongodb.SpringbootMongodb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.SpringbootMongodb.Model.Account;

public interface AccountRepository extends MongoRepository<Account, String> {
	
}
