package com.person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PersonController {
	
	@Autowired
	private PersonService personService;

	@RequestMapping(value="/persons/findByName/{name}", method=RequestMethod.GET)
	@CrossOrigin(origins = "http://localhost:3000")
	public Collection<Person> greetMessage(@PathVariable String name) {
		System.out.println("findByEmail" + name);
		return this.personService.findPersonByName(name);
	}
	
	@RequestMapping(value="/persons/getall/", method=RequestMethod.GET, produces = { "application/json", "text/json" })
	@CrossOrigin(origins = "http://localhost:3000")
	public @ResponseBody List<Person> fetchAll() {
		List<Person> list = new ArrayList<Person>();
		for(Person person: this.personService.findAll()) {
			list.add(person);
		}
		return list;
	}
}
