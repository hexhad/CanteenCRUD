package com.ruh.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CrudApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);

		System.out.println("\nCHECK PATH >> localhost:8081/api");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CrudApplication.class);
	}

}
