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
		logger.info("Abhinav | hooked jenkins with github ----->>>>>");
		logger.info("Abhinav | hooked jenkins with github on 19-01-2023 at 3:48PM IST ----->>>>>");
		logger.info("Abhinav | hooked jenkins with github on 20-01-2023 at 8:55AM IST ----->>>>>");
	}

}
