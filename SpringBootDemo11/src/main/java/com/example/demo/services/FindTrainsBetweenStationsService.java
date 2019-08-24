package com.example.demo.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.FindTrainsBetweenStationsDao;
import com.example.demo.entities.FindTrainBetweenStation;

@Service
public class FindTrainsBetweenStationsService {
	@Autowired
	FindTrainsBetweenStationsDao findTrainsBetweenStationsDao;
	
	public FindTrainBetweenStation createFindTrainBetweenStation(FindTrainBetweenStation findTrainBetweenStation) {
		// TODO Auto-generated method stub
		return findTrainsBetweenStationsDao.save(findTrainBetweenStation);
	}

	@SuppressWarnings("deprecation")
	public List<FindTrainBetweenStation> getTrainBetweenStationBySstationAndDstationAndDoj(String sStation, String dStation, Date date) {
		// TODO Auto-generated method stub
		//FindTrainBetweenStation findTrainBetweenStation = new FindTrainBetweenStation();
		List<FindTrainBetweenStation> trains= (List<FindTrainBetweenStation>) findTrainsBetweenStationsDao.findAll();
		List<FindTrainBetweenStation> returnstrains = new ArrayList<FindTrainBetweenStation>();
		for(FindTrainBetweenStation train: trains) {
			if(train.getsStation().equalsIgnoreCase(sStation) && train.getdStation().equalsIgnoreCase(dStation) && (date.getYear() <= train.getDoj().getYear())
					&& (date.getMonth() <= train.getDoj().getMonth())
					&& (date.getDay() <= train.getDoj().getDay())) {
				
				returnstrains.add(train);
				
			}
		}
		return returnstrains;
	}

}
