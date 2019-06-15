package com.example.petclinic.services;

import java.util.Set;

import com.example.petclinic.model.Owner;

public interface OwnerService
{
	Owner save(Owner owner);
	
	Owner findByLastName(String lastName);

	Owner findById(Long id);
	
	Set<Owner> findAll();
}
