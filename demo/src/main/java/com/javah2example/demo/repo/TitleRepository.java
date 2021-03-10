package com.javah2example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.javah2example.demo.DTO.TitleQueryResponse;
import com.javah2example.demo.data.Title;

@Repository
public interface TitleRepository extends JpaRepository<Title,Integer> {

	//@Query("select u.userName from User u inner join u.area ar where ar.idArea = :idArea")
	//@Query("SELECT * FROM Release_date_type a LEFT JOIN cache_media b on a.id=b.id")
		//select t.WORKER_REF_ID ,w.FIRST_NAME from Title t Join Worker w on t.WORKER_REF_ID = w.WORKER_ID;
	//
	@Query("select new com.javah2example.demo.DTO.TitleQueryResponse(t.workerRefId,w.department) from Title t Join Worker w on t.workerRefId = w.worker")
	/*
	 * @Query("select new com.javah2example.demo.DTO.TitleQueryResponse(t.workerRefId,w.firstName) from Title t Join t.Worker w"
	 */
	  public List<TitleQueryResponse> getTitleQueryData();
	//select t.worker_Ref_Id, t.worker_Title,t.affected_From, from Title t where t.worker_ref_id = 001and t.worker_title = 'Manager';
	
	/*
	 * @Query("select t.worker_Ref_Id, t.worker_Title,t.affected_From, from Title t where t.worker_ref_id = 001and t.worker_title = 'Manager';"
	 * ) public Optional<Title> getTwoParamResponse(@Param ("titleId") int
	 * titleId, @Param ("workerTitle") String workerTitle);
	 */
	 }
