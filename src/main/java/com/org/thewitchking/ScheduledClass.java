package com.org.thewitchking;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledClass {

	final static Logger logger=LoggerFactory.getLogger("ScheduledClass.class");
	
	@Scheduled(fixedDelay=7000)
	public void scheduler() {
		logger.info("this is ScheduledClass logger :"+ Calendar.getInstance().getTime());
	}
}