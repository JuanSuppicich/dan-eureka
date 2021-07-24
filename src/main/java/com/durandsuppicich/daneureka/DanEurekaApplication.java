package com.durandsuppicich.daneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DanEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DanEurekaApplication.class, args);
	}

}
