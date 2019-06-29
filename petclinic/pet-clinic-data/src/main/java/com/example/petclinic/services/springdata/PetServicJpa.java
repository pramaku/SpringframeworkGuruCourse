package com.example.petclinic.services.springdata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.petclinic.model.Pet;
import com.example.petclinic.model.PetType;
import com.example.petclinic.repositories.PetRepository;
import com.example.petclinic.services.PetService;

@Service
@Profile("springdatajpa")
public class PetServicJpa implements PetService
{
	private final PetRepository petRepository;

	public PetServicJpa(PetRepository petRepository)
	{
		super();
		this.petRepository = petRepository;
	}

	@Override
	public Set<Pet> findAll()
	{
		Set<Pet> types = new HashSet<>();
		petRepository.findAll().iterator().forEachRemaining(types::add);
		return types;
	}

	@Override
	public Pet findById(Long id)
	{
		return petRepository.findById(id).orElse(null);
	}

	@Override
	public Pet save(Pet object)
	{
		return petRepository.save(object);
	}

	@Override
	public void delete(Pet object)
	{
		petRepository.delete(object);		
	}

	@Override
	public void deleteById(Long id)
	{
		petRepository.deleteById(id);
	}

}
