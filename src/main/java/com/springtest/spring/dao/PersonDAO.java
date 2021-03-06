package com.springtest.spring.dao;

import com.springtest.spring.model.Person;

import java.util.List;

public interface PersonDAO {

    public void addPerson(Person p);
    public void updatePerson(Person p);
    public List<Person> listPerson();
    public Person getPersonById(int id);

    Person getPersonId(int id);

    public void removePerson(int id);
}
