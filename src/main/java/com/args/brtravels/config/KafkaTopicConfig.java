package com.args.brtravels.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic userStatusTopic(){
        return TopicBuilder.name("userStatus")
                .partitions(2)
                .replicas(1)
                .build();
    }

}
