package com.ssr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockscreenerApplication {

	private static final Logger logger = LoggerFactory.getLogger(StockscreenerApplication.class);

    public static void main(String[] args) {
		logger.debug("Starting application...");
		SpringApplication.run(StockscreenerApplication.class, args);

    }
}
