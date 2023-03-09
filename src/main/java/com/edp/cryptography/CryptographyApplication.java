package com.edp.cryptography;

import controller.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = HomeController.class)
public class CryptographyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptographyApplication.class, args);
	}

}
