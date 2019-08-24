package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.TicketsDao;
import com.example.demo.entities.Tickets;
import com.example.demo.entities.Users;

@Service
public class TicketsService {
	
	@Autowired
	TicketsDao ticketsDao;
	
	public Tickets createTicket(Tickets tickets) {
		// TODO Auto-generated method stub
		return ticketsDao.save(tickets);
	}
		
	public Tickets getTicketById(Integer tId) {
			// TODO Auto-generated method stub
		return ticketsDao.findOne(tId);
		}
	
	public Iterable<Tickets> getAllTickets() {
		// TODO Auto-generated method stub
		return ticketsDao.findAll();
	}
	
	public void deleteTicket(Integer tId) {
		// TODO Auto-generated method stub
		ticketsDao.delete(tId);
		
	}

}
