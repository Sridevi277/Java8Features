package com.crudoperations.springbootCrudOp.service;


import java.util.List;

import com.crudoperations.springbootCrudOp.entity.User;

public interface UserService {

	// Save operation
    User saveUser(User user);

   // Read operation
   List<User> fetchUserList();

   // Update operation
   User updateUser(User user,Long userId);

   // Delete operation
   void deleteUserById(Long userId);
}
