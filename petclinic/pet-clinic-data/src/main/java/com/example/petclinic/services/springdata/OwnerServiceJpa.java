package com.example.petclinic.services.springdata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.petclinic.model.Owner;
import com.example.petclinic.repositories.OwnerRepository;
import com.example.petclinic.repositories.PetRepository;
import com.example.petclinic.repositories.PetTypeRepository;
import com.example.petclinic.services.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerServiceJpa implements OwnerService
{
	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;

	public OwnerServiceJpa(OwnerRepository ownerRepository,
			PetRepository petRepository, 
			PetTypeRepository petTypeRepository)
	{
		super();
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<Owner> findAll()
	{
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().iterator().forEachRemaining(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long id)
	{
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner owner)
	{
		return ownerRepository.save(owner);
	}

	@Override
	public void delete(Owner owner)
	{
		ownerRepository.delete(owner);
	}

	@Override
	public void deleteById(Long id)
	{
		ownerRepository.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName)
	{
		return ownerRepository.findByLastName(lastName);
	}

}
