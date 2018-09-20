package com.ms.managment.system.msemployeeserach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsEmployeeserachApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEmployeeserachApplication.class, args);
	}
}
