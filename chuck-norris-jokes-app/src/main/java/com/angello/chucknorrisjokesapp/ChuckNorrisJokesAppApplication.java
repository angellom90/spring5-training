package com.angello.chucknorrisjokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class ChuckNorrisJokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisJokesAppApplication.class, args);
	}
}
