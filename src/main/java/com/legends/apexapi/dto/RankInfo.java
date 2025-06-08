package com.legends.apexapi.dto;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class RankInfo{
	
	private long rankScore;
	private String rankName;
	private int rankDiv; 
	
}
