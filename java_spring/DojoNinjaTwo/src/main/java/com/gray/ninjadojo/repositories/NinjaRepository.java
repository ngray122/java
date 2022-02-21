package com.gray.ninjadojo.repositories;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.gray.ninjadojo.models.Ninja;


@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {

}
