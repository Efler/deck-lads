package org.eflerrr.decklads.service;

import com.pengrad.telegrambot.TelegramBot;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TelegramBotService {

    private final TelegramBot bot;

    // todo: logic realization
    public void spam() {
        log.info("Starting spam");
        // todo: check if api-token in bot are valid one
    }

}
