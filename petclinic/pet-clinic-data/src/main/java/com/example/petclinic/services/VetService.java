package com.example.petclinic.services;

import java.util.Set;

import com.example.petclinic.model.Vet;

public interface VetService
{
	Vet save(Vet vet);
	
	Vet findById(Long id);
	
	Set<Vet> findAll();
}
