package com.mongodb.SpringbootMongodb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.SpringbootMongodb.Model.Rates;

@Repository
public interface RatesRepository extends MongoRepository<Rates, String> {
	
}
