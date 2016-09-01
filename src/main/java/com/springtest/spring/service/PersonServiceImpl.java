package com.springtest.spring.service;

import com.springtest.spring.dao.PersonDAO;
import com.springtest.spring.model.Person;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO personDAO){
        this.personDAO = personDAO;
    }

    @Override
    @Transactional
    public void addPerson(Person p){
        this.personDAO.addPerson(p);
    }

    @Override
    @Transactional
    public void updatePerson(Person p){
        this.personDAO.updatePerson(p);
    }

    @Override
    @Transactional
    public List<Person> listPerson(){
        return this.personDAO.listPerson();
    }

    @Override
    @Transactional
    public Person getPersonById(int id){
        return this.personDAO.getPersonById(id);
    }

    @Override
    @Transactional
    public void removePerson(int id){
        this.personDAO.removePerson(id);
    }

}
