package com.javaguides.springbootbackend;

import org.h2.engine.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaguides.controller.UserController;
import com.javaguides.repository.UserRepo;

@SpringBootApplication
public class SpringBootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

	@Autowired
	private UserRepo userRepo;

	public void run(String... args) throws Exception {
		this.userRepo.save(new User("Justin", "Ochoa", "justin.ochoa@gmail.com"));
		this.userRepo.save(new User("Tony", "Ochoa", "tony.ochoa@gmail.com"));
		this.userRepo.save(new User("Tom", "Cruise", "tom.cruise@gmail.com"));
	}

}
