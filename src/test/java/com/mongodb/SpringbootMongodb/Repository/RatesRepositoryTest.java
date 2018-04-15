package com.mongodb.SpringbootMongodb.Repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mongodb.SpringbootMongodb.Model.Rate;
import com.mongodb.SpringbootMongodb.Model.Rates;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RatesRepositoryTest {
	@Autowired
	private RatesRepository ratesRepository;
	
	@Test
	public void testFindAll() {
		System.out.println("************************************************************");
        System.out.println("Start Testing");
        System.out.println("************************************************************");
        
        List<Rates> rates = ratesRepository.findAll();
        
//        for(Rates rate : rates) {
//        	System.out.println(rate.toString());
//        }
//        
//        for(Rate rate : rates.get(0).getRate()) {
//        	System.out.println(rate.toString());
//        }
        System.out.println(rates.get(0));
        
        System.out.println("************************************************************");
        System.out.println("End Testing");
        System.out.println("************************************************************");
	}

}
