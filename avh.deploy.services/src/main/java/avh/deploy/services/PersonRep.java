package avh.deploy.services;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import avh.deploy.data.Person;

@Repository
public interface PersonRep extends CrudRepository<Person, String> {
	List<Person> findByEmail(String email);
}
