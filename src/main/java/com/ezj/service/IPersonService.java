package com.ezj.service;

import java.util.List;

import com.ezj.model.Person;


public interface IPersonService {

    /**
     * ����ȫ����person
     * @return
     */
    public List<Person> loadPersons();
}
