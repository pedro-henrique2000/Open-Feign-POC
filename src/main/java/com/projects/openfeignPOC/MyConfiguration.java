package com.projects.openfeignPOC;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    Logger.Level loggerLevel() {
        return Logger.Level.FULL;
    }
}
