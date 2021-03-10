package com.javah2example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javah2example.demo.DTO.QueryResponse;
import com.javah2example.demo.DTO.TitleQueryResponse;
import com.javah2example.demo.data.Title;
import com.javah2example.demo.data.Worker;
import com.javah2example.demo.repo.TitleRepository;
import com.javah2example.demo.repo.WorkerRepository;
import com.javah2example.demo.service.JpaUtil;

@RestController
public class JpaController {

	@Autowired
	WorkerRepository jpaRepo;
	
	@Autowired
	TitleRepository titleRepository;
	
	@Autowired
	JpaUtil jpaUtil;
	
	@GetMapping("/getDataFromWorker")
	public List<Title> getData(){
		List<Title> list = new ArrayList<>();
		list = titleRepository.findAll();
		
		return list;
	}
	@GetMapping("/getManagerData")
	public HashMap<Object,Object> getManagerData(){
		
		List<TitleQueryResponse>
		managerData = new ArrayList<>();
		  
		//TitleQueryResponse titleQueryResponse = new TitleQueryResponse();
		
		HashMap<Integer,Optional<Worker>> map1 = new HashMap<>();
		HashMap<Object,Object> resultMap = new HashMap<>();
		try {
			map1.putAll(jpaUtil.init());
			System.out.println("Map1 "+map1); 
			
			managerData = titleRepository.getTitleQueryData();
			/*
			 * for(TitleQueryResponse s : managerData) {
			 * titleQueryResponse.setFirstName(s.getFirstName());
			 * titleQueryResponse.setWorkerRefId(s.getWorkerRefId()); }
			 * 
			 * System.out.println("TitleQueryResponse"+titleQueryResponse);
			 */
			for(int i = 0; i<8 ;i++) {
				
				managerData.get(i);
				
				System.out.println("ManagaerData get i "+managerData.get(i));
				//resultMap.put(managerData.get(i),map1.put(i, map1.get(i)));
				
				resultMap.put(managerData.get(i), map1.get(i));
			}
			
			System.out.println("resultMap"+resultMap);
			
		
			System.out.println("Maanager List "+managerData);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return resultMap;
}
	
	@GetMapping("/getEmployeeDetails/{id}/{title}")
	public Optional<Title> getEmployeeDetails(@PathVariable Map<String, String>map){
		Optional<Title> getEmpDetails = null;
		
		String workerId = map.get("id");
		int workerId1 = Integer.parseInt(workerId);
		String workerTitle = map.get("title");
		try {
			if(workerId != null && workerTitle !=null) {
				//getEmpDetails = titleRepository.getTwoParamResponse(workerId1,workerTitle);	
			}
			
			}catch(Exception e) {
				e.printStackTrace(); 
			}
		
		return getEmpDetails;
	}
	
	
}	
