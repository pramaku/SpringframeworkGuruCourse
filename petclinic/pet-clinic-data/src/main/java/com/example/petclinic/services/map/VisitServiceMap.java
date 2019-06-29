package com.example.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.petclinic.model.Visit;
import com.example.petclinic.services.VisitService;

@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService
{
	@Override
	public Set<Visit> findAll()
	{
		return super.findAll();
	}

	@Override
	public Visit findById(Long id)
	{
		return super.findById(id);
	}

	@Override
	public Visit save(Visit visit)
	{
		if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null || visit.getPet().getOwner().getId() == null )
		{
			throw new RuntimeException("cannot save, invalid data");
		}
		return super.save(visit);
	}

	@Override
	public void delete(Visit object)
	{
		super.delete(object);
	}

	@Override
	public void deleteById(Long id)
	{
		super.deleteById(id);
	}

}
