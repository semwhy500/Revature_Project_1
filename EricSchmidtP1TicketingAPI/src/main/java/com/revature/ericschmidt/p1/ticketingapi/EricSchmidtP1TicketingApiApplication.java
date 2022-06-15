package com.revature.ericschmidt.p1.ticketingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//The main driver class to begin the service

@SpringBootApplication
public class EricSchmidtP1TicketingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EricSchmidtP1TicketingApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
