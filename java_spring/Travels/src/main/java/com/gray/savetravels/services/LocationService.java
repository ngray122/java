package com.gray.savetravels.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gray.savetravels.models.Locations;
import com.gray.savetravels.repositories.TravalRepository;

@Service
public class LocationService {
	
private final TravalRepository placeRepo;




	public LocationService(TravalRepository placeRepo) {
		this.placeRepo = placeRepo;
	}
    
	
	public List<Locations> allLocations() {
		return (List<Locations>)this.placeRepo.findAll();
	}
	
//	public Location createLocation(Location men) {
//		
//	}
  

}
