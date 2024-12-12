package com.book.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class GoogleBooksService {

    @Value("${google.books.api.key}")
    private String apiKey;

    public String fetchDescriptionForBook(String isbn) {
        String apiUrl = "https://www.googleapis.com/books/v1/volumes?q=isbn:" + isbn + "&key=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();

        try {
            
            ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);

           
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(response.getBody());

           
            JsonNode items = rootNode.get("items");
            if (items != null && items.isArray() && items.size() > 0) {
                JsonNode volumeInfo = items.get(0).get("volumeInfo");
                if (volumeInfo != null && volumeInfo.has("description")) {
                    return volumeInfo.get("description").asText();
                }
            }
        } catch (Exception e) {
            System.err.println("Error fetching description: " + e.getMessage());
        }

        // Return a default message or null if description is not found
        return "Description not available";
    }
}
