package com.mongodb.SpringbootMongodb.Repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.SpringbootMongodb.Model.Transaction;

@Repository
public interface TransactionRespository extends MongoRepository<Transaction, String> {
	public List<Transaction> findByState(String state) throws Exception;
	
	public Page<Transaction> findByAccount(ObjectId account, Pageable pageable) throws Exception;
	
	public List<Transaction> findByAccount(ObjectId account) throws Exception;
	
	public List<Transaction> findByDeal(Integer deal) throws Exception;
}
