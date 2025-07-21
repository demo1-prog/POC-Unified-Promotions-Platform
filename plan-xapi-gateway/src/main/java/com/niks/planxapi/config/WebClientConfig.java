package com.niks.planxapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${services.planevent.base-url}")
    private String planeventBaseUrl;

    @Value("${services.promotion.base-url}")
    private String promotionBaseUrl;

    @Bean
    public WebClient planeventWebClient() {
        return WebClient.builder()
                .baseUrl(planeventBaseUrl)
                .build();
    }

    @Bean
    public WebClient promotionWebClient() {
        return WebClient.builder()
                .baseUrl(promotionBaseUrl)
                .build();
    }
}
