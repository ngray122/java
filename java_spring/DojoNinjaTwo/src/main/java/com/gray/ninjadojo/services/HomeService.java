package com.gray.ninjadojo.services;

import java.util.List;



import org.springframework.stereotype.Service;

import com.gray.ninjadojo.models.Dojo;
import com.gray.ninjadojo.models.Ninja;
import com.gray.ninjadojo.repositories.DojoRepository;
import com.gray.ninjadojo.repositories.NinjaRepository;


@Service
public class HomeService {
	private final DojoRepository dojoRepo;
	private final NinjaRepository ninjaRepo;
	

	
	public HomeService(DojoRepository dojoRepo, NinjaRepository ninjaRepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}
	
	public Dojo createDojo(Dojo d) {
		return this.dojoRepo.save(d);
	}
	
	public List<Dojo> getallDojos() {
		return (List<Dojo>)this.dojoRepo.findAll();
	}
	
	public Ninja createNinja(Ninja n) {
		return this.ninjaRepo.save(n);
	}
	

	
	public Dojo getOne(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}


}
