package com.servicio.armas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.commons.models.entity"})
public class ServicioArmasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioArmasApplication.class, args);
	}

}
