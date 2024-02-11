package com.validation.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//Default COmfigure class we create this when SpringIOC doesnt have any info about which object to create
	//this bean annotation educate IOC to whicj object to create as Modelmaper is #rd party library
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}

}
