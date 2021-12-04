package com.DiegoChacon.MascotaServicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.naming.ldap.Control;
import javax.persistence.Access;

@SpringBootApplication
public class MascotaServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MascotaServicioApplication.class, args);
	}
	@Bean
	public RestTemplate getrestemplate(){
		return new RestTemplate();
	}

}

