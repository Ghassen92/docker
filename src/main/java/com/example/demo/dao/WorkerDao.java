package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Worker;

public interface WorkerDao extends JpaRepository<Worker,Long>{

}
