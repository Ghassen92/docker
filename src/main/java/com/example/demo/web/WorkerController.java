package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.WorkerDao;

@RestController
public class WorkerController {

	@Autowired
	WorkerDao workerDao;

	@GetMapping("/")
	public String sayHello() {
		return workerDao.getOne(1l).toString();
	}

}
