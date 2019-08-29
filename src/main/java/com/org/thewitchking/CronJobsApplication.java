package com.org.thewitchking;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class CronJobsApplication {

	private static final Logger logger = LoggerFactory.getLogger(CronJobsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CronJobsApplication.class, args);
		logger.info("this is a info message");
	      logger.warn("this is a warn message");
	      logger.error("this is a error message");
	}
	
	@Scheduled(fixedDelay=5000)
	public void run() {
		logger.info("Current time is :: " + Calendar.getInstance().getTime());
		
	}

}
