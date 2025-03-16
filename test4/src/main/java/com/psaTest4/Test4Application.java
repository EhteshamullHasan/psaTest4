package com.psaTest4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test4Application {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		System.out.println(x+y);
		SpringApplication.run(Test4Application.class, args);
	}

}
