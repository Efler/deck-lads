package org.eflerrr.decklads;

import org.eflerrr.decklads.configuration.ApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfig.class)
public class DeckLadsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeckLadsApplication.class, args);
    }

}
