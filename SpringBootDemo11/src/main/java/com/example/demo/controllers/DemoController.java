package com.example.demo.controllers;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.entities.FindTrainBetweenStation;
import com.example.demo.entities.Passanger;
import com.example.demo.entities.Tickets;
import com.example.demo.entities.Users;
import com.example.demo.services.EmployeeService;
import com.example.demo.services.FindTrainsBetweenStationsService;
import com.example.demo.services.PassangerService;
import com.example.demo.services.TicketsService;
import com.example.demo.services.UserService;

@RestController
@RequestMapping(value="/")
public class DemoController {
	
	@Autowired
	public EmployeeService employeeService;
	
	@Autowired
	public UserService usersService;
	
	@Autowired
	public TicketsService ticketsService;
	
	@Autowired
	public PassangerService passangerService;
	
	@Autowired
	FindTrainsBetweenStationsService findTrainsBetweenStationsService;
	
	@PostMapping(value="/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping(value="/employee/{employee_id}")
	private Employee getEmployeeById(@PathVariable("employee_id") Integer employee_id) {
		return employeeService.getEmployeeById(employee_id);
	}
	
	@GetMapping(value="/employee/allEmployee")
	public Iterable<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@DeleteMapping(value="/delete/{employee_id}")
	public void deleteEmployee(@PathVariable("employee_id") Integer employee_id) {
		employeeService.createEmployee(employee_id);
	}
	
//---------------------------------------Users Controllers-----------------------------------------------	
	
	@PostMapping(value="/createUser")
	public Users createUsers(@RequestBody Users employee) {
		return usersService.createUsers(employee);
	}
	
	@GetMapping(value="/User/{userId}")
	private Users getzuserById(@PathVariable("userId") Integer userId) {
		return usersService.getUserById(userId);
	}
	
	@GetMapping(value="/Users/allUser")
	public Iterable<Users> getAllUsers(){
		return usersService.getAllUsers();
	}
	
	@DeleteMapping(value="/deleteUsers/{userId}")
	public void deleteUser(@PathVariable("userId") Integer userId) {
		usersService.deleteUser(userId);
	}

//---------------------------------------------Ticket Controller---------------------------------------------
	
	@PostMapping(value="/createTicket")
	public Tickets createTickets(@RequestBody Tickets tickets) {
		return ticketsService.createTicket(tickets);
	}
	
	@GetMapping(value="/Tickets/{tId}")
	private Tickets getTicketrById(@PathVariable("tId") Integer tId) {
		return ticketsService.getTicketById(tId);
	}
	
	@GetMapping(value="/Tickets/allTickets")
	public Iterable<Tickets> getAllTickets(){
		return ticketsService.getAllTickets();
		}
	
	@DeleteMapping(value="/deleteTickets/{tId}")
	public void deleteTicket(@PathVariable("tId") Integer tId) {
		ticketsService.deleteTicket(tId);
	}
	
//--------------------------------------Passanger Controller------------------------------------------------passangerService
	

	@PostMapping(value="/createPassanger")
	public Passanger createPassanger(@RequestBody Passanger passanger) {
		return passangerService.createPassanger(passanger);
	}
	
	@GetMapping(value="/Passanger/{pId}")
	private Passanger getPassangerById(@PathVariable("pId") Integer pId) {
		return passangerService.getPassangerById(pId);
	}
	
	@GetMapping(value="/Passanger/allPassangers")
	public Iterable<Passanger> getAllPassangers(){
		return passangerService.getAllPassangers();
		}
	
	@DeleteMapping(value="/deletePassanger/{pId}")
	public void deletePassanger(@PathVariable("pId") Integer pId) {
		passangerService.deletePassanger(pId);
	}
	
	@GetMapping(value="/Passanger/GetPassangerByPassangerName/{pName}")
	public Passanger GetPassangerByPassangerName(@PathVariable("pName") String pName){
		return passangerService.GetPassangerNameByPassangerName(pName);
		}
	
	@GetMapping(value="/Passanger/GetPassangerTicketByPid/{pid}")
	public Tickets GetPassangerBookingDetails(@PathVariable("pid") Integer pid){
		return passangerService.GetPassangerBookingDetails(pid);
		}
	
	
	//---------------------------FindTrainBetweenStation Controller--------------------------------------------------------------------
	@PostMapping(value="/createFindTrainBetweenStation")
	public FindTrainBetweenStation createFindTrainBetweenStation(@RequestBody FindTrainBetweenStation findTrainBetweenStation) {
		System.out.println("date is----->" + findTrainBetweenStation.getDoj());
		return findTrainsBetweenStationsService.createFindTrainBetweenStation(findTrainBetweenStation);
	}
	
	@GetMapping(value="/FindTrainBetweenStationBySstationAndDstationAndDoj/{sStation}/{dStation}/{doj}")
	public List<FindTrainBetweenStation> FindTrainBetweenStationBySstationAndDstationAndDoj(@PathVariable("sStation") String sStation,
			@PathVariable("dStation") String dStation, @PathVariable("doj") String doj) throws ParseException{ 
		 Date date=new SimpleDateFormat("dd-MM-yyyy").parse(doj);
		 System.out.println(date);
		return findTrainsBetweenStationsService.getTrainBetweenStationBySstationAndDstationAndDoj(sStation,dStation,date);
		
		}
}
