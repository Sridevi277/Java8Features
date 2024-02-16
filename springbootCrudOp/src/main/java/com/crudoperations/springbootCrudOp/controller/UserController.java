package com.crudoperations.springbootCrudOp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudoperations.springbootCrudOp.entity.User;
import com.crudoperations.springbootCrudOp.service.UserService;

@RestController
public class UserController {
	@Autowired 
	private UserService userService;
	 
    // Save operation
    @PostMapping("/users")
    public User saveUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }
 
    // Read operation
    @GetMapping("/users")
 
    public List<User> fetchUserList()
    {
        return userService.fetchUserList();
    }
 
    // Update operation
    @PutMapping("/users/{id}")
 
    public User
    updateUser(@RequestBody User user,
                     @PathVariable("id") Long userId)
    {
        return userService.updateUser(
            user, userId);
    }
 
    // Delete operation
    @DeleteMapping("/users/{id}")
 
    public String deleteUserById(@PathVariable("id")
                                       Long userId)
    {
        userService.deleteUserById(
            userId);
        return "Deleted Successfully";
    }

}
