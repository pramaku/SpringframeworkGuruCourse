package com.example.petclinic.services.springdata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.petclinic.model.Vet;
import com.example.petclinic.repositories.VetRepository;
import com.example.petclinic.services.VetService;

@Service
@Profile("springdatajpa")
public class VetServiceJpa implements VetService
{
	private final VetRepository vetRepository;

	public VetServiceJpa(VetRepository vetRepository)
	{
		super();
		this.vetRepository = vetRepository;
	}

	@Override
	public Set<Vet> findAll()
	{
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().iterator().forEachRemaining(vets::add);
		return vets;
	}

	@Override
	public Vet findById(Long id)
	{
		return vetRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet vet)
	{
		return vetRepository.save(vet);
	}

	@Override
	public void delete(Vet vet)
	{
		vetRepository.delete(vet);
	}

	@Override
	public void deleteById(Long id)
	{
		vetRepository.deleteById(id);
	}

}
