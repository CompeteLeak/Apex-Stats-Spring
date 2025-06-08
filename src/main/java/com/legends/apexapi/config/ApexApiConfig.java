package com.legends.apexapi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@ConfigurationProperties(prefix = "apex")
public class ApexApiConfig {
    private String apiKey;
}
