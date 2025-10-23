package com.codegym.jira;

import com.codegym.jira.common.internal.config.AppProperties;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
@EnableCaching
public class CodegymJiraApplication {

    public static void main(String[] args) {
        // Cargar variables del archivo .env
        Dotenv dotenv = Dotenv.configure()
                .ignoreIfMissing()
                .load();
        
        // Establecer las variables como propiedades del sistema
        dotenv.entries().forEach(entry -> 
                System.setProperty(entry.getKey(), entry.getValue()));
        
        SpringApplication.run(CodegymJiraApplication.class, args);
    }
}
