package com.kevle0215;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class OnlineFoodOrderingApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
        System.setProperty("STRIPE_API_KEY", dotenv.get("STRIPE_API_KEY"));
		SpringApplication.run(OnlineFoodOrderingApplication.class, args);
	}

}
