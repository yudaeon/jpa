package com.example.jpa;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    private final AppRepository repository;

    public AppService(AppRepository repository){
        this.repository = repository;
    }
    //주된 비즈니스 로직이 구현되는 공간
    //Controller -> Service
    // Service
    //1. 데이터베이스 조회
    //2. Component 사용
    //3. 모든 데이터를 가지고 응답
    public List<Object> readStudentAll(){
        List<Object> queryResult = repository.selectStudentAll();
        //some business logic
        return  queryResult;
    }
}
