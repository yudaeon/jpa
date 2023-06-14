package com.example.jpa;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    //스프링을 활용하는 데 필요한 다양한 설정을 담고 있는 용도

    @Bean
    public AppConfigData connectionUrl(){
        //이 메소드의 결과(반환값)을 Bean객체로 등록
        if (true /*현재 나의 상황에 따라서 다른 URL을 지급하는 코드 */)
            return new AppConfigData("main-url");
        else return new AppConfigData("backup-url");
    }

    @Bean
    public Gson gson(){
        return new Gson();
    }
}
