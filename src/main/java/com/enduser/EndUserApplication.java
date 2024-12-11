package com.enduser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.enduser.*")
public class EndUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndUserApplication.class, args);
	}

}
