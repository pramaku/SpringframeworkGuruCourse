package com.example.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.springwebapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>
{

}
