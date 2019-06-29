package com.example.petclinic.services.springdata;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.petclinic.model.Visit;
import com.example.petclinic.repositories.VisitRepository;
import com.example.petclinic.services.VisitService;

@Service
@Profile("springdatajpa")
public class VisitServiceJpa implements VisitService
{
	private final VisitRepository visitRepository;

	public VisitServiceJpa(VisitRepository visitRepository)
	{
		super();
		this.visitRepository = visitRepository;
	}

	@Override
	public Set<Visit> findAll()
	{
		Set<Visit> visits = new HashSet<>();
		visitRepository.findAll().iterator().forEachRemaining(visits::add);
		return visits;
	}

	@Override
	public Visit findById(Long id)
	{
		return visitRepository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit visit) 
	{
		return visitRepository.save(visit);
	}

	@Override
	public void delete(Visit visit)
	{
		visitRepository.delete(visit);
	}

	@Override
	public void deleteById(Long id)
	{
		visitRepository.deleteById(id);
	}
}
