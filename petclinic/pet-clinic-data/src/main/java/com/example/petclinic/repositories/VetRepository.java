package com.example.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long>
{
	
}
