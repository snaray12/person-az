package com.person;

import java.util.List;

public interface PersonService {

	public Iterable<Person> findAll();
	public void savePerson(Person person);
	public Person findPersonById(long id);
	public List<Person> findPersonByEmail(String email);
	public List<Person> findPersonByName(String name);
}
