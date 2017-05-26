package com.ezj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezj.dao.PersonMapper;
import com.ezj.model.Person;
import com.ezj.service.IPersonService;

@Service("personService")
public class PersonServiceImpl implements IPersonService {
    
    private PersonMapper personMapper;

    public PersonMapper getPersonMapper() {
        return personMapper;
    }
    @Autowired
    public void setPersonMapper(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }
	public List<Person> loadPersons() {
		// TODO Auto-generated method stub
		return personMapper.queryAll();
	}
    
}
