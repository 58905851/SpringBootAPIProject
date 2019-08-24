package com.example.demo.Dao;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.FindTrainBetweenStation;

public interface FindTrainsBetweenStationsDao extends CrudRepository<FindTrainBetweenStation, Integer>{
	
}
