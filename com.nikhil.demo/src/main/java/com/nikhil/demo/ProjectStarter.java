package com.nikhil.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
@SpringBootApplication //lets it run as standalone application
@Configuration //necessary
@ImportResource("integration-context.xml") //picks up configuration of beans from mentioned file
public class ProjectStarter implements ApplicationRunner{ //must implement ApllicationRUnner
	
	@Autowired
	private SenderGateway sender;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectStarter.class, args); //starts spring apllication
	}

	public void run(ApplicationArguments args) { //after application starts it executes this method
		sender.print("Hey There Nikhil");
	}
}
