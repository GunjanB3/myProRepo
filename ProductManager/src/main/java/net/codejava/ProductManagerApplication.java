package net.codejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductManagerApplication {

	public static void main(String[] args) {
		//System.out.println("Hello In Spring Boot-------------");
		SpringApplication.run(ProductManagerApplication.class, args);
		
		System.out.println("Hello In Spring Boot-------------After args");
	}

}
