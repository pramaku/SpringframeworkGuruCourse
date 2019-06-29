package com.example.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>
{
	Owner findByLastName(String lastName);
}
