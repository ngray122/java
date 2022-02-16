package com.gray.savetravels.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gray.savetravels.models.Locations;


@Repository
public interface TravalRepository extends CrudRepository<Locations, String>{

}
