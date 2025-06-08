package com.legends.apexapi.dto;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class GlobalInfo{
	
	private RankInfo rank;
	private String name;
	
}
