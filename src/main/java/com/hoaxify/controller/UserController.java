package com.hoaxify.controller;

import com.hoaxify.entity.User;
import com.hoaxify.service.UserService;
import com.hoaxify.shared.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // DI because test we're not unit testing controllers
    @Autowired
    UserService userService;

    @PostMapping("/api/1.0/users")
    public GenericResponse createUser(@RequestBody User user) {
        userService.save(user);
        return new GenericResponse("User saved.");
    }

}
