package com.legends.apexapi.dto;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ApexPlayerDTO{
	
	private GlobalInfo global;
	private RealTimeInfo realtime;
	private LegendsDTO legends; 
	
}
