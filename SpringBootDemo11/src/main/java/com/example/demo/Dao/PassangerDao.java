package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Passanger;
import com.example.demo.entities.Tickets;

public interface PassangerDao extends JpaRepository<Passanger, Integer>{
	
	public  Passanger findByPassName(String PassName);
	
	public Passanger findTicketsByPassId(Integer pid);
	
	
}
