package com.example.petclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Pet;
import com.example.petclinic.model.PetType;
import com.example.petclinic.model.Speciality;
import com.example.petclinic.model.Vet;
import com.example.petclinic.model.Visit;
import com.example.petclinic.services.OwnerService;
import com.example.petclinic.services.PetTypeService;
import com.example.petclinic.services.SpecialityService;
import com.example.petclinic.services.VetService;
import com.example.petclinic.services.VisitService;

@Component
public class DataLoader implements CommandLineRunner
{
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialityService specialityService;
	private final VisitService visitService;
	
	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService)
	{
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialityService = specialityService;
		this.visitService = visitService;
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

		Pet p1 = new Pet();
		p1.setName("rasco");
		//p1.setOwner(owner1);
		p1.setPetType(dog);
		p1.setBirthDate(LocalDate.now());

		Owner owner1 = new Owner();
		owner1.setFirstName("Bob");
		owner1.setLastName("Scmidt");
		owner1.setAddress("street1");
		owner1.setCity("NY");
		owner1.setTelephone("1234");
		owner1.getPets().add(p1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Terry");
		owner2.setLastName("Lang");
		owner2.setAddress("street2");
		owner2.setCity("PH");
		owner2.setTelephone("5678");
		owner2.getPets().add(p1);
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

		Visit v1 = new Visit();
		v1.setDate(LocalDate.now());
		v1.setDescription("General checkup");
		p1.setOwner(owner1);
		v1.setPet(p1);
		
		visitService.save(v1);
	}
}
