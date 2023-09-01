package com.example.PokimansDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PokimansDemo.model.MyData;

@Repository
public interface MyDataRepository extends JpaRepository <MyData, Long>{

}
