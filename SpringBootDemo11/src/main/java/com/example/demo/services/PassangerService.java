package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.PassangerDao;
import com.example.demo.entities.Passanger;
import com.example.demo.entities.Tickets;

@Service
public class PassangerService {
	
	@Autowired
	PassangerDao PassangerDao;
	
	public Passanger createPassanger(Passanger passanger) {
		// TODO Auto-generated method stub
		return PassangerDao.save(passanger);
	}
	
	public Passanger getPassangerById(Integer pId) {
		// TODO Auto-generated method stub
	return PassangerDao.findOne(pId);
	}
	
	public Iterable<Passanger> getAllPassangers() {
		// TODO Auto-generated method stub
		return PassangerDao.findAll();
	}
	
	public void deletePassanger(Integer pId) {
		// TODO Auto-generated method stub
		PassangerDao.delete(pId);
	}

	public Passanger GetPassangerNameByPassangerName(String pName) {
		// TODO Auto-generated method stub
		return PassangerDao.findByPassName(pName);
	}

	public Tickets GetPassangerBookingDetails(Integer pid) {
		// TODO Auto-generated method stub
		return PassangerDao.findTicketsByPassId( pid).getTickets();
	}

}
