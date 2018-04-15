package com.mongodb.SpringbootMongodb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.SpringbootMongodb.Model.Rates;

public interface RatesRepository extends MongoRepository<Rates, String> {
	
}
