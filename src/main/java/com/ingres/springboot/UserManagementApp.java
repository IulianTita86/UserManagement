package com.ingres.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.ingres.springboot.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.ingres.springboot"})
public class UserManagementApp {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApp.class, args);
	}
}
