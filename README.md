# Apex Legends Stats API

A Spring Boot application that fetches and exposes player statistics from the Apex Legends public API provided by [api.mozambiquehe.re](https://apexlegendsapi.com/).

## 📌 Features

- Fetch player stats from the Apex Legends API
- RESTful endpoint to retrieve stats in structured JSON format
- Cleanly organized with DTOs, services, and controller layers
- Uses external configuration for secure API key management
---------------------------------------------------------------------------------------------------

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Maven
- Jackson (for JSON mapping)
- RestTemplate (HTTP requests)
---------------------------------------------------------------------------------------------------

## ⚙️ Getting Started

### Prerequisites

- Java 17 or later
- Maven
- API key from [https://apexlegendsapi.com/](https://apexlegendsapi.com/)

### Setup

**Clone the repository:**
---------------------------------------------------------------------------------------------------

-Add your API key:

-Create a file named secrets.yml inside src/main/resources/:

apex:
  apiKey: your_api_key_here
---------------------------------------------------------------------------------------------------

Build and run the application: mvn spring-boot:run
---------------------------------------------------------------------------------------------------

Access the endpoint: http://localhost:8080/api/apex/player/info?player=<player_username>&platform=<platform>
---------------------------------------------------------------------------------------------------
