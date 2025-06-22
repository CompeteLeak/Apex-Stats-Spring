package com.legends.apexapi.controller;


import com.legends.apexapi.dto.ApexPlayerDTO;
import com.legends.apexapi.services.ApexService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
@RestController
@RequestMapping("/api/apex")
@CrossOrigin(origins ="http://localhost:5173")
public class PlayerController {

    private final ApexService apexService;

    @Autowired
    public PlayerController(ApexService apexService) {
        this.apexService = apexService;
    }

    // Raw JSON response from the API
    @GetMapping("/player/raw")
    public ResponseEntity<String> getRawPlayerData(
            @RequestParam (name = "player") String player,
            @RequestParam String platform) {

        String rawJson = apexService.getRawPlayerData(player, platform);
        return ResponseEntity.ok(rawJson);
    }

    // Parsed JSON into DTO
    @GetMapping("/player/info")
    public ResponseEntity<ApexPlayerDTO> getParsedPlayerData(
    		@RequestParam (name = "player") String player,
            @RequestParam String platform) {

        ApexPlayerDTO dto = apexService.getPlayerStats(player, platform);
        return ResponseEntity.ok(dto);
    }
}
