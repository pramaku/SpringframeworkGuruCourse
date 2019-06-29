package com.example.petclinic.services.springdata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.petclinic.model.PetType;
import com.example.petclinic.repositories.PetTypeRepository;
import com.example.petclinic.services.PetTypeService;

@Service
@Profile("springdatajpa")
public class PetTypeServicJpa implements PetTypeService
{
	private final PetTypeRepository petTypeRepository;
	
	
	public PetTypeServicJpa(PetTypeRepository petTypeRepository)
	{
		super();
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<PetType> findAll()
	{
		Set<PetType> types = new HashSet<>();
		petTypeRepository.findAll().iterator().forEachRemaining(types::add);
		return types;
	}

	@Override
	public PetType findById(Long id)
	{
		return petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType object)
	{
		return petTypeRepository.save(object);
	}

	@Override
	public void delete(PetType object)
	{
		petTypeRepository.delete(object);		
	}

	@Override
	public void deleteById(Long id)
	{
		petTypeRepository.deleteById(id);
	}

}
