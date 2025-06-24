package com.aishwarya.SpringBoot_ECommerce2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootECommerce2Application implements CommandLineRunner {

	public static void main(String[] args)  {

		SpringApplication.run(SpringBootECommerce2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("********* E-COMMERCE APPLICATION *********");
	}
}
