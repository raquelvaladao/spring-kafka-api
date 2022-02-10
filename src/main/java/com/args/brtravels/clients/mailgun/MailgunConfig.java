package com.args.brtravels.clients.mailgun;

import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class MailgunConfig {

    @Value("${mailgun.apiKey}")
    private String API_KEY;

    @Bean
    public RequestInterceptor requestInterceptor(){
        return requestTemplate -> {
          requestTemplate.header(
                  "Authorization",
                  String.format("Bearer %s", API_KEY)
          );
          requestTemplate.header(
                  "Accept",
                  "application/json"
          );
        };
    }

    @Bean
    public Logger.Level logger(){
        return Logger.Level.FULL;
    }
}
