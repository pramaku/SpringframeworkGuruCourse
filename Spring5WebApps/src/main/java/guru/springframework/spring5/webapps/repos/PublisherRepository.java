package guru.springframework.spring5.webapps.repos;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5.webapps.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>
{

}
