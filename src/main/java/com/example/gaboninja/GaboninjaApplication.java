package com.example.gaboninja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example"})
public class GaboninjaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GaboninjaApplication.class, args);
	}
}
