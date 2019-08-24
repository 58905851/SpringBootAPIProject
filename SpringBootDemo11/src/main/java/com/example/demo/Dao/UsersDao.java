package com.example.demo.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Users;

public interface UsersDao extends CrudRepository<Users, Integer>{

}
