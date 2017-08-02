package com.vineet.product.micorserviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicorserviceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicorserviceApiApplication.class, args);
	}
}
