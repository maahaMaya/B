package coms.SpringBootUsingDataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.SpringBootUsingDataJPA.model.Cricket;


@Repository
public interface CricketRepo extends JpaRepository<Cricket, Integer> {

	/*
	 * save()			Creating
		saveAndFlush() 		Modifing
		findAll() 		View All
		findById() 		Find one record
		deleteById()		delete a record
	 */
}
