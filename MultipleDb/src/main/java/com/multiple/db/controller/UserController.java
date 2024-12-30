package com.multiple.db.controller;

import com.multiple.db.domain.response.UserResponseDto;
import com.multiple.db.mysql.entity.User;
import com.multiple.db.response.AppResponse;
import com.multiple.db.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/id")
    public ResponseEntity<AppResponse<UserResponseDto>> getUserById(@PathVariable("id") int userId){
        return new ResponseEntity<>(userService.getUserById(userId), HttpStatus.OK);
    }

}
