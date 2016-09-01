package com.springtest.spring.dao;

import com.springtest.spring.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAOImpl implements PersonDAO {

    private static final Logger logger =
            LoggerFactory.getLogger(PersonDAOImpl.class);
}
