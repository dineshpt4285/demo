package com.zen.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Create conflict");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Create conflict");
	}

}
