package com.abhinav.springbootforjenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootforjenkinsApplicationTests {
	
	Logger logger = LoggerFactory.getLogger(SpringbootforjenkinsApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Abhinav | Test case executing----->>>>>");
		assertEquals(true, true);
	}

}
