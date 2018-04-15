package com.mongodb.SpringbootMongodb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.SpringbootMongodb.Model.Transaction;

public interface TransactionRespository extends MongoRepository<Transaction, String> {

}
