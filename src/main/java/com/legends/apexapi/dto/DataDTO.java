package com.legends.apexapi.dto;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class DataDTO{
	
	private String name; 
	private long value;
	
}
