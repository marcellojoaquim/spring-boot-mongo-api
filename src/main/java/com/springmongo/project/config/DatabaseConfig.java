package com.springmongo.project.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class DatabaseConfig {

    private static final Dotenv dotenv = Dotenv.load();

    private static final String username = dotenv.get("DB_USERNAME");
    private static final String password = dotenv.get("DB_PASSWORD");
    private static final String host = dotenv.get("DB_HOST");
    private static final int port = (int)Integer.parseInt(dotenv.get("DB_PORT", "default value"));
    private static final String database = dotenv.get("DB_NAME");


}
