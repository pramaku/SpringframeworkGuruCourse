package com.example.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long>
{
	
}
