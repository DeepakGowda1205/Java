package com.example.PokimansDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PokimansDemo.model.MyData;
import com.example.PokimansDemo.repository.MyDataRepository;

@Service
public class MyDataService {
	 @Autowired
	    private MyDataRepository myDataRepository;

	    public MyData saveData(MyData data) {
	        return  myDataRepository.save(data);
	    }
	    public List<MyData> getAllData() {
	        return myDataRepository.findAll();
	    }
}