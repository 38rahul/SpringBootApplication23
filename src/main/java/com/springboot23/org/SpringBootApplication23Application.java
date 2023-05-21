package com.springboot23.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpringBootApplication23Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication23Application.class, args);
	}

}
