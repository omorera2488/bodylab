package com.bluelitelabs.bodylab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "BodyLab API", version = "1.0", description = "New API as Example"))
public class BodylabApplication {

	public static void main(String[] args) {
		SpringApplication.run(BodylabApplication.class, args);
	}

}
