package com.jpmc.custom.initilizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Import;



@SpringBootApplication
//@EnableCaching
@Import(CustomInitializrConfiguration.class)

public class CustomInitilizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomInitilizerApplication.class, args);
	}
}
