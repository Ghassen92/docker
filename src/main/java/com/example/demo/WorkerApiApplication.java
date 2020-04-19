package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.WorkerDao;
import com.example.demo.model.Worker;

@SpringBootApplication
public class WorkerApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WorkerApiApplication.class, args);
	}

	@Autowired
	WorkerDao workerDao;

	@Override
	public void run(String... args) throws Exception {
		workerDao.save(new Worker("ME"));
	}

}
