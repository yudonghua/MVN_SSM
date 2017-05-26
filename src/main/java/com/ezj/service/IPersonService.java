package com.ezj.service;

import java.util.List;

import com.ezj.model.Person;


public interface IPersonService {

    /**
     * 加载全部的person
     * @return
     */
    public List<Person> loadPersons();
}
