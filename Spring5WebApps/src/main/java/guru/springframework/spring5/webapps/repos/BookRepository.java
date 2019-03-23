package guru.springframework.spring5.webapps.repos;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5.webapps.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>
{

}
