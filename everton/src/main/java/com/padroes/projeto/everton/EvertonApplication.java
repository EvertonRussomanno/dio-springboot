package com.padroes.projeto.everton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EvertonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvertonApplication.class, args);
	}

}
