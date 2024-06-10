package com.springmongo.project.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

    private static final Dotenv dotenv = Dotenv.load();

    private static final String username = dotenv.get("DB_USERNAME");
    private static final String password = dotenv.get("DB_PASSWORD");
    private static final String host = dotenv.get("DB_HOST");
    private static final int port = Integer.parseInt(dotenv.get("DB_PORT"));
    private static final String database = dotenv.get("DB_NAME");


}
