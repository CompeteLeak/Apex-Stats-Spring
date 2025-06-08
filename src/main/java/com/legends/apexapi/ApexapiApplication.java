package com.legends.apexapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.legends.apexapi.config.ApexApiConfig;

@SpringBootApplication
@EnableConfigurationProperties(ApexApiConfig.class)
public class ApexapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApexapiApplication.class, args);
	}

}
