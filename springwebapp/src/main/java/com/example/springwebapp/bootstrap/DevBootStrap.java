package com.example.springwebapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.springwebapp.model.Author;
import com.example.springwebapp.model.Book;
import com.example.springwebapp.model.Publisher;
import com.example.springwebapp.repositories.AuthorRepository;
import com.example.springwebapp.repositories.BookRepository;
import com.example.springwebapp.repositories.PublisherRepository;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent>
{

	private AuthorRepository authRepo;
	private BookRepository bookRepo;
	private PublisherRepository publisherRepo;

	public DevBootStrap(AuthorRepository authRepo, BookRepository bookRepo, PublisherRepository publisherRepo) {
		super();
		this.authRepo = authRepo;
		this.bookRepo = bookRepo;
		this.publisherRepo = publisherRepo;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event)
	{
		initData();
	}

	private void initData()
	{
		Author a1 = new Author("John", "Thomson");
		Publisher p1 = new Publisher("udemy", "wallstreet NY");
		Book b1 = new Book("Spring framework Guru","1234", p1);
		Book b2 = new Book("Spring React", "4567", p1);

		a1.getBooks().add(b1);
		a1.getBooks().add(b2);

		b1.getAuthors().add(a1);
		b2.getAuthors().add(a1);

		authRepo.save(a1);
		publisherRepo.save(p1);
		bookRepo.save(b1);
		bookRepo.save(b2);
	}
}
