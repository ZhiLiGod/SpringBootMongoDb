package com.mongodb.SpringbootMongodb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.SpringbootMongodb.Model.Account;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {
	public Account findByDisplayName(String displayName);
}
