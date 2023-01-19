package com.abhinav.springbootforjenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootforjenkinsApplication implements CommandLineRunner{
	
	public static Logger logger = LoggerFactory.getLogger(SpringbootforjenkinsApplication.class);
	
	/*
	 * @PostConstruct public void init() { logger.info("Application started.....");
	 * }
	 */
	
	public static void main(String[] args) {
		logger.info("Abhinav | Its for Jenkins testing.....");
		SpringApplication.run(SpringbootforjenkinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Abhinav | Its for Jenkins testing again=====>>>>>");
	}

}
