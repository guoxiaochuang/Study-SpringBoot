package com.just.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SpringBootDemoJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoJpaApplication.class, args);
	}

}

