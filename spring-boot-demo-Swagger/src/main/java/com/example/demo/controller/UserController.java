package com.example.demo.controller;

import com.example.demo.entity.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/users")
@Api(description = "用户管理")
public class UserController {

    private Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @GetMapping(value = "/")
    @ApiOperation(value = "获取用户列表", notes = "获取用户列表")
    public List<User> getUserList() {
        return new ArrayList<>(users.values());
    }

    @PostMapping(value = "/")
    @ApiOperation(value = "创建用户")
    public String addUser(@RequestBody User user) {
        users.put(user.getId(), user);
        return "Success!";
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "删除用户", notes = "根据id删除用户")
    @ApiImplicitParam(name = "id", value = "用户id", dataTypeClass = Long.class, required = true)
    public String deleteUserById(@PathVariable Long id) {
        users.remove(id);
        return "Success!";
    }

    @PutMapping(value = "/{id}")
    @ApiOperation(value = "根据id更新用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "1"),
            @ApiImplicitParam(name = "name", value = "用户姓名", defaultValue = "guoxiaoxiao"),
            @ApiImplicitParam(name = "age", value = "用户年龄", defaultValue = "18")
    })
    public User updateUserById(@PathVariable Long id, @RequestParam String name, @RequestParam String age) {
        User user = users.get(id);
        user.setName(name);
        user.setAge(age);
        return user;
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "根据id获取指定用户")
    @ApiImplicitParam(name = "id", value = "用户id", paramType = "query", dataTypeClass = Long.class, defaultValue = "999", required = true)
    public User getUserById(@PathVariable Long id) {
        return users.get(id);
    }
}
