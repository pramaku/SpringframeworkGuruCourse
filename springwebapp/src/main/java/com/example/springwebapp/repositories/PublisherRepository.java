package com.example.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.springwebapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>
{

}
