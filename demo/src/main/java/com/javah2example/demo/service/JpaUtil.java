package com.javah2example.demo.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javah2example.demo.data.Worker;
import com.javah2example.demo.repo.WorkerRepository;

@Component
public class JpaUtil {
	
	@Autowired
	WorkerRepository workerRepo;

	public  HashMap<Integer,Optional<Worker>> map = new HashMap<>();
	
	public HashMap<Integer,Optional<Worker>> init() {
		
		for(int i =1 ; i<=8; i++) {
			Optional<Worker> list = workerRepo.findById(i);
			map.put(i,list);
		}
		System.out.println("Map In Util Class"+map);
		return map;
		
	}

}
