package com.mongodb.SpringbootMongodb.controller;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import java.nio.charset.Charset;
import java.util.Arrays;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.mongodb.SpringbootMongodb.SpringbootMongodbApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMongodbApplication.class)
@WebAppConfiguration
public abstract class BaseControllerTest {
	MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(),
			Charset.forName("UTF-8"));
	
	MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Before
	public void setup() throws Exception {
	    this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}
}
