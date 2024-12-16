package org.eflerrr.decklads.configuration;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app")
@Validated
public record ApplicationConfig(
        @NotNull(message = "Some of Bot configs are not valid! Check configurations!")
        @Valid
        Bot bot
) {

    public record Bot(
            @NotBlank
            String apiToken
    ) {
    }

}
