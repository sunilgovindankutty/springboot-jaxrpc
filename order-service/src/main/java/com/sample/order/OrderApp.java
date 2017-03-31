package com.sample.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration

public class OrderApp {
	 public static void main(String[] args) {
	        SpringApplication.run(OrderApp.class, args);
	    }
}
