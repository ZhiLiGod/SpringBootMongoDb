package com.mongodb.SpringbootMongodb.controller;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.*;

import org.junit.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TransactionControllerTest extends BaseControllerTest {

	@Test
	public void testGetTransationsByAccount() {
		
	}
	
	@Test
	public void testGetAll() throws Exception {
		mockMvc.perform(get("/transaction/all"))
			.andDo(log())
			.andExpect(status().isOk())
			.andExpect(content().contentType(contentType))
			.andExpect(jsonPath("$", hasSize(12403)));
	}

}
