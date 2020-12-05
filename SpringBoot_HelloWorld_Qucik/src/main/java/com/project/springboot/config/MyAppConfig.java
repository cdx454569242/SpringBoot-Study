package com.project.springboot.config;

import com.project.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
    @Bean
    public HelloService helloService(){
        System.out.println("配置类给容器添加组件");
        return new HelloService();
    }
}
