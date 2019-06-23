package com.example.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.petclinic.model.Speciality;
import com.example.petclinic.services.SpecialityService;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService
{
	@Override
	public Set<Speciality> findAll()
	{
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id)
	{
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object)
	{
		return super.save(object);
	}

	@Override
	public void delete(Speciality object)
	{
		super.delete(object);
	}

	@Override
	public void deleteById(Long id)
	{
		super.deleteById(id);
	}
}