package com.example.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.petclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long>
{
	
}
