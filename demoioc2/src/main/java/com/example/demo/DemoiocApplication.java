package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.example.loose.DripCoffeeMachine;

// 소스가 다른패키지에 있으면 검색이 안됨 -> 검색 범위 늘려준다
@SpringBootApplication(scanBasePackages = "com.example")
// xml 불러오기
// ImportResource("classpath:beans.xml")
public class DemoiocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoiocApplication.class, args);
		
	}

}
