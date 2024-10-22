package com.app.zelo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.zelo.models.Labour;


@Repository
public interface LabourDao extends JpaRepository<Labour,Integer> {

	List<Labour> findByNameContains(String name);

	@Query(value = "SELECT MAX(labour_Id)+1 FROM labour", nativeQuery = true)
	String getLatestId();
	
	//Long findTopByOrderBylabour_IdDesc() +1; - alternative way
}
