package com.lakshmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParvatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParvatApplication.class, args);
		System.out.println("Parvat with the blessings of Lord Shiva carries Lord Shiva mounted on his brother Nandi.");
		System.out.println(Thread.currentThread().getName() + "");
	}

}
