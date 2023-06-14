package com.example.jpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//모든 메소드에 @ ReponseBody를 붙이는 용도
public class AppController {
    //사용자의 입력을 받는 요소
    private final AppService service;

    public AppController(AppService service){
        this.service = service;
    }

    //RequestMapping과 같이 사용
    @RequestMapping("students")
    public void students(){
        List<Object> result = service.readStudentAll();
    }

    @GetMapping("home")
    public String home(){
        return "home";
    }

    @GetMapping("body")
    public @ResponseBody String body(){
        return "body";

    }
}
