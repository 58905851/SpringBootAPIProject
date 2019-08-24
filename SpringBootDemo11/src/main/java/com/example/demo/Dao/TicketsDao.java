package com.example.demo.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Tickets;

public interface TicketsDao extends CrudRepository<Tickets, Integer>{

}
