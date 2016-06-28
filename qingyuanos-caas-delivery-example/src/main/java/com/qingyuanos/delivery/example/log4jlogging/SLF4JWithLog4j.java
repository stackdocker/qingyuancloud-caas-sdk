package com.qingyuanos.delivery.example.log4jlogging;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class SLF4JWithLog4j {
	
	static {
		//PropertyConfigurator.configure("classpath:com/qingyuanos/delivery/example/log4j.properties");
		PropertyConfigurator.configure(SLF4JWithLog4j.class.getClassLoader().getResource("com/qingyuanos/delivery/example/log4j.properties"));
		//PropertyConfigurator.configure(this.getClass().getClassLoader().getResource("./log4j.properties"));

        Object obj = System.getenv("APP_ENV");
		if (obj != null) {
		    MDC.put("environment", System.getenv("APP_ENV"));
		}
		
	}
	
	static final Logger logger = LoggerFactory.getLogger(SLF4JWithLog4j.class);

    public SLF4JWithLog4j() {
	    logger.debug("Hello World!");
		logger.info("info");
		logger.warn("warning!");
		logger.error("error");
    }
	
	public static void main(String[] args) {
		SLF4JWithLog4j obj = new SLF4JWithLog4j();

	}
}