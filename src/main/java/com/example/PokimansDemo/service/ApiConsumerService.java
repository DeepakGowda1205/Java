package com.example.PokimansDemo.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.PokimansDemo.model.MyData;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ApiConsumerService {
    @Autowired
    private MyDataService myDataService;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private RestTemplate restTemplate;

    public void fetchDataAndStore(String url ) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("https://pokeapi.co/api/v2/"+ url, String.class);
        String json = response.getBody();

       // ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
           MyData data = objectMapper.readValue(json,MyData.class);
           myDataService.saveData(data);
        } catch (IOException e) {
            e.printStackTrace();
       }
//        ObjectMapper objectMapper = new ObjectMapper();
//        MyData data = objectMapper.readValue(response.getBody(), MyData.class);
//        
//       // MyData data = response.getBody();
		//return null;
        
//        MyData data = restTemplate.getForObject("https://pokeapi.co/api/v2/"+ url, MyData.class);
//        return myDataService.saveData(data);
    }
}
