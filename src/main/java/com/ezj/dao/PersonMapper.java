package com.ezj.dao;

import java.util.List;

import com.ezj.model.Person;


public interface PersonMapper {
    /**
     * ����һ����¼
     * @param person
     */
    void insert(Person person);
    
    /**
     * ��ѯ����
     * @return
     */
    List<Person> queryAll();
}