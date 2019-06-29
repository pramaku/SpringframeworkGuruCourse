package com.example.petclinic.services.springdata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.petclinic.model.PetType;
import com.example.petclinic.model.Speciality;
import com.example.petclinic.repositories.PetTypeRepository;
import com.example.petclinic.repositories.SpecialityRepository;
import com.example.petclinic.services.SpecialityService;

@Service
@Profile("springdatajpa")
public class SpecialityServicJpa implements SpecialityService
{
	private final SpecialityRepository specialityRepository;
	
	
	public SpecialityServicJpa(SpecialityRepository specialityRepository)
	{
		super();
		this.specialityRepository = specialityRepository;
	}

	@Override
	public Set<Speciality> findAll()
	{
		Set<Speciality> specialities = new HashSet<>();
		specialityRepository.findAll().iterator().forEachRemaining(specialities::add);
		return specialities;
	}

	@Override
	public Speciality findById(Long id)
	{
		return specialityRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality object)
	{
		return specialityRepository.save(object);
	}

	@Override
	public void delete(Speciality object)
	{
		specialityRepository.delete(object);		
	}

	@Override
	public void deleteById(Long id)
	{
		specialityRepository.deleteById(id);
	}

}
