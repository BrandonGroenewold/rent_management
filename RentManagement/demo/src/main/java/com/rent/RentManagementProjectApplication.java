package com.rent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("application.properties")
public class RentManagementProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentManagementProjectApplication.class, args);
	}

}
