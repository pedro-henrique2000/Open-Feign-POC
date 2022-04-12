package com.projects.openfeignPOC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeignPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenFeignPocApplication.class, args);
	}

}
