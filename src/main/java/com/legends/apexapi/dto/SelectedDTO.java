package com.legends.apexapi.dto;
import lombok.Data;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data 
public class SelectedDTO{
	
	@JsonProperty("LegendName")
    private String legendName;
	
	private List<DataDTO> data;
	
}
