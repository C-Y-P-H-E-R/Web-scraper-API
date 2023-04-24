package com.example.api;

import com.example.api.file_api_converter.FlReader;
import com.example.api.file_api_converter.FlService;
import com.google.gson.JsonObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@GetMapping("/")
	public String serveSourceOfSite() {
		FlService flService = new FlService();
		return flService.convertStringToJsonObject();
	}
}
