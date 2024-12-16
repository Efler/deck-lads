package org.eflerrr.decklads.configuration.bean;

import com.pengrad.telegrambot.TelegramBot;
import lombok.RequiredArgsConstructor;
import org.eflerrr.decklads.configuration.ApplicationConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class TelegramBotBeans {

    private final ApplicationConfig config;

    @Bean
    public TelegramBot telegramBotBean() {
        return new TelegramBot(config.bot().apiToken());
    }

}
