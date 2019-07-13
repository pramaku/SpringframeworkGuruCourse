package com.example.petclinic.services.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.petclinic.model.Owner;

class OwnerServiceMapTest
{
	private OwnerServiceMap ownerServiceMap;

	@BeforeEach
	void setUp() throws Exception
	{
		ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(), new PetServiceMap());
	}

	@Test
	void testFindAll()
	{
		Owner owner1 =  new Owner();
		ownerServiceMap.save(owner1);
		Set<Owner> result = ownerServiceMap.findAll();
		assertTrue(result.contains(owner1));
	}

	@Test
	void testFindById()
	{
		Owner owner1 =  new Owner();
		owner1.setId(1L);
		ownerServiceMap.save(owner1);
		Owner result = ownerServiceMap.findById(1L);
		assertEquals(result, owner1);
	}

	@Test
	void testSaveOwner()
	{
		Owner owner1 =  new Owner();
		owner1.setId(2L);
		ownerServiceMap.save(owner1);
		
		Owner result = ownerServiceMap.findById(2L);
		assertEquals(result, owner1);
	}

	@Test
	void testDeleteOwner()
	{
		Owner owner1 =  new Owner();
		owner1.setId(2L);
		ownerServiceMap.save(owner1);
		
		ownerServiceMap.delete(owner1);
		Owner result = ownerServiceMap.findById(2L);
		assertNull(result);
	}

	@Test
	void testDeleteById()
	{
		Owner owner1 =  new Owner();
		owner1.setId(2L);
		ownerServiceMap.save(owner1);
		
		ownerServiceMap.deleteById(2L);
		Owner result = ownerServiceMap.findById(2L);
		assertNull(result);
	}

	@Test
	void testFindByLastName()
	{
		Owner owner1 =  new Owner();
		owner1.setId(1L);
		owner1.setLastName("Guru");
		ownerServiceMap.save(owner1);
		
		Owner owner2 =  new Owner();
		owner2.setId(2L);
		owner2.setLastName("Thomson");
		ownerServiceMap.save(owner2);
		
		Owner result = ownerServiceMap.findByLastName("Guru");
		assertEquals(owner1, result);
		
		result = ownerServiceMap.findByLastName("Unknown");
		assertNull(result);
	}

}
