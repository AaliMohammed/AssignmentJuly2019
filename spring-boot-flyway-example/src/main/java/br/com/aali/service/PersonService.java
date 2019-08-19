package br.com.aali.service;

import java.util.List;

import br.com.aali.model.entity.Person;

/**
 * The Person Service Interface.
 * 
 * @author Ryan Padilha <ryan.padilha@gmail.com>
 * @since 0.1
 *
 */
public interface PersonService {

	List<Person> list();

	Person get(Long id);

	Person create(Person person);

	Person update(Long id, Person person);

	Person delete(Long id);
}
