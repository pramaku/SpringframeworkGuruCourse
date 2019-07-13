package com.example.petclinic.services.springdata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.example.petclinic.model.Owner;
import com.example.petclinic.repositories.OwnerRepository;
import com.example.petclinic.repositories.PetRepository;
import com.example.petclinic.repositories.PetTypeRepository;

class OwnerServiceJpaTest
{
	@Mock
	OwnerRepository ownerRepo;

	@Mock
	PetRepository petRepository;

	@Mock
	PetTypeRepository petTypeRepository;
	
	OwnerServiceJpa ownerServiceJpa;
	Owner owner1;
	Owner owner2;
	
	@BeforeEach
	void setUp() throws Exception
	{
		ownerServiceJpa = new OwnerServiceJpa(ownerRepo, petRepository, petTypeRepository);
		MockitoAnnotations.initMocks(this);
		Owner owner1 =  new Owner();
		owner1.setId(1L);
		owner1.setLastName("Guru");
		
		Owner owner2 =  new Owner();
		owner2.setId(2L);
		owner2.setLastName("Thomson");

		Set<Owner> owners = new HashSet<>();
		owners.add(owner1);
		owners.add(owner2);

		Mockito.when(ownerRepo.findAll()).thenReturn(owners);
		Mockito.when(ownerRepo.findById(1L)).thenReturn(Optional.of(owner1));
	}

	@Test
	void testFindAll()
	{
		Set<Owner> results = ownerServiceJpa.findAll();
		assertTrue(results.contains(owner1));
		assertTrue(results.contains(owner2));
	}

	@Test
	void testFindById()
	{
		Owner result = ownerServiceJpa.findById(1L);
		assertEquals(owner1, result);
	}

	@Test
	void testSave()
	{
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteById() {
		fail("Not yet implemented");
	}

	@Test
	void testFindByLastName() {
		fail("Not yet implemented");
	}

}
