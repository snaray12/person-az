package com.person;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SimplePersonService implements PersonService {
	@Autowired
	private PersonRepository personRepository;

	@Override
	public Iterable<Person> findAll() {
		return personRepository.findAll();
	}

	@Override
	public void savePerson(Person person) {
		personRepository.save(person);
	}

	@Override
	public Person findPersonById(long id) {
		return personRepository.findOne(id);
	}

	@Override
	public List<Person> findPersonByEmail(String email) {
		return personRepository.findByEmail(email);
	}
	@Override
	public List<Person> findPersonByName(String name) {
		return personRepository.findByName(name);
	}
}
