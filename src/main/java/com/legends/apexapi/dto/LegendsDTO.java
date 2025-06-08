package com.legends.apexapi.dto;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data 
public class LegendsDTO{
	
	private SelectedDTO selected;
		
}
