package com.args.brtravels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BrtravelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrtravelsApplication.class, args);
	}
/*
	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> {
			for (int i = 0; i < 100; i++) {

				kafkaTemplate.send("userStatus", "this user is invalid :(" + i);
			}

		};
	}*/
}
