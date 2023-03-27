package com.example;

import com.dtflys.forest.springboot.annotation.ForestScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ForestScan("com.example.forest")
public class Demo20230327SpringbootYs7Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo20230327SpringbootYs7Application.class, args);
    }

}
