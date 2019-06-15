package com.example.petclinic.services;

import java.util.Set;

import com.example.petclinic.model.Pet;

public interface PetService
{
	Pet save(Pet pet);
	
	Pet findById(Long id);
	
	Set<Pet> findAll();
}
