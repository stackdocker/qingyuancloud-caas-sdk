package com.qingyuanos.delivery.example;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jWithLog4jAndLogstash {

	public static void main(String[] args) {
		//PropertyConfigurator.configure("classpath:com/qingyuanos/delivery/example/log4j.properties");
		PropertyConfigurator.configure(Slf4jWithLog4jAndLogstash.class.getClassLoader().getResource("com/qingyuanos/delivery/example/log4j.properties"));
		//PropertyConfigurator.configure(this.getClass().getClassLoader().getResource("./log4j.properties"));

		Logger logger = LoggerFactory.getLogger(Slf4jWithLog4jAndLogstash.class);
		logger.debug("Hello World!");
		logger.info("info");
		logger.warn("warning!");
		logger.error("error");

	}
}
