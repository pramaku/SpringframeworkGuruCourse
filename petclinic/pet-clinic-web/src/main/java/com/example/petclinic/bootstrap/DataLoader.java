package com.example.petclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.petclinic.model.Owner;
import com.example.petclinic.model.PetType;
import com.example.petclinic.model.Speciality;
import com.example.petclinic.model.Vet;
import com.example.petclinic.services.OwnerService;
import com.example.petclinic.services.PetService;
import com.example.petclinic.services.PetTypeService;
import com.example.petclinic.services.SpecialityService;
import com.example.petclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner
{
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialityService specialityService;
	
	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService)
	{
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialityService = specialityService;
	}

	@Override
	public void run(String... args) throws Exception
	{
		int count = petTypeService.findAll().size();
		if (count == 0)
		{
			loadData();
		}
	}

	private void loadData()
	{
		PetType dog = new PetType();
		dog.setName("Pup");
		petTypeService.save(dog);
	
		PetType cat = new PetType();
		cat.setName("Nas");
		petTypeService.save(cat);

		Owner owner1 = new Owner();
		owner1.setFirstName("Bob");
		owner1.setLastName("Scmidt");
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Terry");
		owner2.setLastName("Lang");

		System.out.println("Loading owners .....");
		ownerService.save(owner1);
		ownerService.save(owner2);
		
		Speciality s1 = new Speciality();
		s1.setDescription("Radilogy");
		
		Speciality s2 = new Speciality();
		s2.setDescription("Surgery");
		
		Speciality s3 = new Speciality();
		s3.setDescription("Dentistry");
		
		s1 = specialityService.save(s1);
		s2 = specialityService.save(s2);
		s3 = specialityService.save(s3);

		Vet vet1 = new Vet();
		vet1.setFirstName("Nyan");
		vet1.setLastName("Singh");
		vet1.getSpecialities().add(s1);
		vet1.getSpecialities().add(s2);

		Vet vet2 = new Vet();
		vet2.setFirstName("Mike");
		vet2.setLastName("Tamur");
		vet2.getSpecialities().add(s3);

		System.out.println("Loading vets .....");
		vetService.save(vet1);
		vetService.save(vet2);
	}
}
