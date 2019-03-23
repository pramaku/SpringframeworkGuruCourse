package guru.springframework.spring5.webapps.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import guru.springframework.spring5.webapps.model.Author;
import guru.springframework.spring5.webapps.model.Book;
import guru.springframework.spring5.webapps.model.Publisher;
import guru.springframework.spring5.webapps.repos.AuthorRepository;
import guru.springframework.spring5.webapps.repos.BookRepository;
import guru.springframework.spring5.webapps.repos.PublisherRepository;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent>
{
    private AuthorRepository authRepo;
    private BookRepository bookRepo;
    private PublisherRepository publisherRepo;

    public DevBootStrap(AuthorRepository authRepo, BookRepository bookRepo, PublisherRepository publisherRepo)
    {
        this.authRepo = authRepo;
        this.bookRepo = bookRepo;
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event)
    {
        initDb();
    }

    private void initDb()
    {
        Author a1 = new Author("chad", "derby");
        Publisher p1 = new Publisher("OREalliy", "SAnjose US");
        Book b1 = new Book("Spring basics", p1, "abcd1234");
        // a1.getBooks().add(b1);
        b1.getAuthors().add(a1);
        publisherRepo.save(p1);

        authRepo.save(a1);
        bookRepo.save(b1);

        Publisher p2 = new Publisher("Wrox", "NY US");
        Book b2 = new Book("Domain driven design", p2, "defc-3456");
        Author a2 = new Author("harp", "miller");
        Author a3 = new Author("john", "thomson");
        b2.getAuthors().add(a2);
        b2.getAuthors().add(a3);

        authRepo.save(a2);
        authRepo.save(a3);
        publisherRepo.save(p2);
        bookRepo.save(b2);
    }
}
