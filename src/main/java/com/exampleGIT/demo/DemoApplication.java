package com.exampleGIT.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		System.out.println("questo è il second");
		ciao();
	}
	
	public static String ciao() {
		return "popolo";
	}
}
