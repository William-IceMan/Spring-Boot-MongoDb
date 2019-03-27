package com.example.mongo;

import com.example.mongo.document.Users;
import com.example.mongo.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UsersRepository usersRepository){
		return strings ->{
			usersRepository.save(new Users(101,"Peter","IT",20000l));
			usersRepository.save(new Users(102,"John","Tech",40000l));
		};

	}

}
