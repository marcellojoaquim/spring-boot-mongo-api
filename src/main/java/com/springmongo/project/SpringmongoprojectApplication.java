package com.springmongo.project;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringmongoprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmongoprojectApplication.class, args);
	}

	@Bean
	public Dotenv loadEnvVariables(){
		return Dotenv.configure().load();
	}
}
