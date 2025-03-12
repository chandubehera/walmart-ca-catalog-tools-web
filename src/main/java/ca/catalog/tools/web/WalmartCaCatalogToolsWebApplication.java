package ca.catalog.tools.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WalmartCaCatalogToolsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalmartCaCatalogToolsWebApplication.class, args);
	}

}
