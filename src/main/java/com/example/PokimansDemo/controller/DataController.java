package com.example.PokimansDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PokimansDemo.model.MyData;
import com.example.PokimansDemo.service.ApiConsumerService;
import com.example.PokimansDemo.service.MyDataService;

@RestController
@RequestMapping("/api/v2")
public class DataController {
    @Autowired
    private MyDataService dataService;   
    @Autowired
    private ApiConsumerService apiConsumer;
//    
////    @Autowired
////    private RestTemplate restTemplate;
//    
//    @Autowired
//    private MyDataRepository myDataRepository;
//    
//    @PostMapping("/save")
//    public MyData saveData(@RequestBody MyData item) {
//        return dataService.saveData(item);
//    }
//    
    @GetMapping("/fetch")
    public List<MyData> fetchData() {
        return dataService.getAllData();
    }
    
    @GetMapping("/fetch-and-save")
    public ResponseEntity<String> fetchAndSaveData(String url) {
        apiConsumer.fetchDataAndStore(url);
        return ResponseEntity.ok("Data fetched and saved successfully.");
    }
    
    
}
