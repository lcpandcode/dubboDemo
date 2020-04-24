package com.example.demoprivider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoPrividerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPrividerApplication.class, args);
	}

}
