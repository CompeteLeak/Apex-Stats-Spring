package com.legends.apexapi.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.legends.apexapi.config.ApexApiConfig;
import com.legends.apexapi.dto.ApexPlayerDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApexService {
	
	@Autowired
	private ApexApiConfig config;
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public ApexService(ApexApiConfig config) {
    	this.config = config; 
        this.restTemplate = new RestTemplate();
        this.objectMapper = new ObjectMapper();
    }

    public ApexPlayerDTO getPlayerStats(String player, String platform) {
    	String apiKey = config.getApiKey();
    	String url = "https://api.mozambiquehe.re/bridge?auth=" + apiKey
                + "&platform=" + platform
                + "&player=" + player;

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "Mozilla/5.0"); 

        HttpEntity<String> entity = new HttpEntity<>(headers);

        // Get raw JSON as String first
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        String rawJson = response.getBody();

        try {
            // Parse JSON String into ApexPlayerDTO
            return objectMapper.readValue(rawJson, ApexPlayerDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }

    // Return raw JSON as String
    public String getRawPlayerData(String player, String platform) {
    	String apiKey = config.getApiKey();
        String url = "https://api.mozambiquehe.re/bridge?auth=" + apiKey
                + "&platform=" + platform
                + "&player=" + player;

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "Mozilla/5.0");

        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                String.class
        );

        return response.getBody();
    }

}
