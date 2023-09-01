//package com.example.PokimansDemo.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ScheduledApiConsumerService {
//	   @Autowired
//	    private ApiConsumerService apiConsumerService;
//
//	    @Scheduled(fixedRate = 3600000) // Run every hour
//	    public void fetchDataAndStoreScheduled() {
//	        apiConsumerService.fetchDataAndStore();
//	    }
//}
