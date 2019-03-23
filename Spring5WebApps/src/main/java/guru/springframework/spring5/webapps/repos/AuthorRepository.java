package guru.springframework.spring5.webapps.repos;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5.webapps.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>
{

}
