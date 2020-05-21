package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.mapper.PersonMapper;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Resource
    private PersonMapper personMapper;

    @GetMapping("/")
    public List<Person> selectAll(){
        return personMapper.selectAll();
    }

    @PostMapping("/insert")
    public int insert(@RequestBody Person record){
        return personMapper.insert(record);
    }

    @DeleteMapping("/{id}")
    public int deleteByPrimaryKey(@PathVariable Integer id){
        return personMapper.deleteByPrimaryKey(id);
    }

    @PostMapping("/update")
    public int updateByPrimaryKey(@RequestBody Person record){
        return personMapper.updateByPrimaryKey(record);
    }

    @GetMapping("/{id}")
    public Person selectByPrimaryKey(@PathVariable Integer id){
        return personMapper.selectByPrimaryKey(id);
    }
}
