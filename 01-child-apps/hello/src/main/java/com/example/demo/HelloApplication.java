package com.example.demo;

import com.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("${demo.package:com.xyz}")
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@Autowired
	Demo demo;

	@Bean
	public CommandLineRunner run(Demo demo) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("Hello!");
				demo.foo();
			}
		};
	}

}
