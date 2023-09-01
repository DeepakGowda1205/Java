//package com.example.PokimansDemo.service;
//
//import org.springframework.web.client.RestTemplate;
//
//import com.example.PokimansDemo.model.MyData;
//import com.example.PokimansDemo.repository.MyDataRepository;
//
//public class ApiDataService {
//    private final MyDataRepository myDataRepository;
//    private final String apiUrl;
//
//    public ApiDataService(MyDataRepository myDataRepository) {
//        this.myDataRepository = myDataRepository;
//        this.apiUrl = "https://pokeapi.co/api/v2/item/1/"; // Update with your API URL
//    }
//
//    public void fetchDataAndStoreInDatabase() {
//        RestTemplate restTemplate = new RestTemplate();
//        MyData[] myDataArray = restTemplate.getForObject(apiUrl, MyData[].class);
//
//        if (myDataArray != null) {
//            for (MyData myData : myDataArray) {
//                myDataRepository.save(myData);
//            }
//        }
//    }
//}
