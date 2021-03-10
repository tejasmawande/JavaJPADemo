package com.javah2example.demo.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javah2example.demo.DTO.QueryResponse;
import com.javah2example.demo.data.Title;
import com.javah2example.demo.data.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker,Integer>{
	
	//@Query("Select W.FIRST_NAME, W.SALARY, T.WORKER_TITLE from WORKER W inner Join Title T on W.WORKER_ID = T.WORKER_REF_ID and T.WORKER_TITLE in ('Manager')")
	//@Query("Select w.firstName,w.salary from Worker AS w where w.firstName in ('Monika')")
	
	/*
	 * @Query("Select new com.javah2example.demo.DTO.QueryResponse(w.firstName, t.workerTitle) from Worker w JOIN w.title t"
	 * ) public List<QueryResponse> getManagerData();
	 */
	 
}
 