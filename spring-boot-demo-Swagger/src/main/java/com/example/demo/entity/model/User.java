package com.example.demo.entity.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="用户",description = "用户实体表")
public class User {
    @ApiModelProperty(value = "用户Id",hidden = true)
    private long id;
    @ApiModelProperty(value = "用户名称")
    private String name;
    @ApiModelProperty(value = "用户年龄")
    private String age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
