package com.bancs;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bancs.model.ParamInput;
import com.bancs.repository.ParamInputRepository;

@SpringBootApplication
public class TcsBancsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcsBancsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner fetchAllData(ParamInputRepository repo) {
		return (args)->{
			List<ParamInput> paramInputs = repo.findAll();
			System.out.println("----------- Parameter Details -------------");
			paramInputs.forEach(System.out::println);
		};
		
	}

}
