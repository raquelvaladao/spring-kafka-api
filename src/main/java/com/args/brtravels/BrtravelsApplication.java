package com.args.brtravels;

import com.args.brtravels.service.ClashService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BrtravelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrtravelsApplication.class, args);
	}

}
