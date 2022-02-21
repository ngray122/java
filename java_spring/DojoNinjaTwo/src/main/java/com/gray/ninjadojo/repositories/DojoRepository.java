package com.gray.ninjadojo.repositories;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.gray.ninjadojo.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {

}
