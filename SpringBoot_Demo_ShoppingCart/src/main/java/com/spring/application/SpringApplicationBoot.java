package com.spring.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.spring")
@SpringBootApplication
public class SpringApplicationBoot {

	public static void main(String[] args) {
		SpringApplication.run(SpringApplicationBoot.class, args);
	}

}
