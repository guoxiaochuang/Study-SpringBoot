package com.example.demo.mapper;

import com.example.demo.entity.Person;

import java.util.List;

public interface PersonMapper {

    List<Person> selectAll();

    int insert(Person record);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Person record);

    Person selectByPrimaryKey(Integer id);

}
