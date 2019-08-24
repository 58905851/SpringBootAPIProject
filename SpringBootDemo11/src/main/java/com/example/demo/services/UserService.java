package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.EmployeeDao;
import com.example.demo.Dao.UsersDao;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Users;

@Service
public class UserService {
	
	@Autowired
	private UsersDao usersDao;
	public Users createUsers(Users users) {
		// TODO Auto-generated method stub
		return usersDao.save(users);
		
	}
	public Users getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return usersDao.findOne(userId);
	}
	public Iterable<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return usersDao.findAll();
	}
	public void deleteUser(Integer employee_id) {
		// TODO Auto-generated method stub
		usersDao.delete(employee_id);
		
	}

}
