package com.example.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>
{
	
}
