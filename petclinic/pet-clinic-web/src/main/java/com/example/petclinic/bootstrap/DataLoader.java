package com.example.petclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Vet;
import com.example.petclinic.services.OwnerService;
import com.example.petclinic.services.VetService;
import com.example.petclinic.services.map.OwnerServiceMap;
import com.example.petclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner
{
	private final OwnerService ownerService;
	private final VetService vetService;
	
	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService)
	{
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception
	{
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Bob");
		owner1.setLastName("Scmidt");
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Terry");
		owner2.setLastName("Lang");

		System.out.println("Loading owners .....");
		ownerService.save(owner1);
		ownerService.save(owner2);
		
		Vet vet1 = new Vet();
		owner1.setId(3L);
		vet1.setFirstName("Nyan");
		vet1.setLastName("Singh");

		Vet vet2 = new Vet();
		owner1.setId(4L);
		vet2.setFirstName("Mike");
		vet2.setLastName("Tamur");

		System.out.println("Loading vets .....");
		vetService.save(vet1);
		vetService.save(vet2);
	}
}
