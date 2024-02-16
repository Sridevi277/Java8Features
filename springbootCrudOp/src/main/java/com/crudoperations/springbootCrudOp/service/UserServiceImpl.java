package com.crudoperations.springbootCrudOp.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudoperations.springbootCrudOp.entity.User;
import com.crudoperations.springbootCrudOp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
    private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> fetchUserList() {
		// TODO Auto-generated method stub
		return (List<User>)
	            userRepository.findAll();
	}

	@Override
	public User updateUser(User user, Long userId) {
		// TODO Auto-generated method stub
		User depDB
        = userRepository.findById(userId)
              .get();

    if (Objects.nonNull(user.getUserName())
        && !"".equalsIgnoreCase(
            user.getUserName())) {
        depDB.setUserName(
            user.getUserName());
    }

    if (Objects.nonNull(
            user.getUserAddress())
        && !"".equalsIgnoreCase(
            user.getUserAddress())) {
        depDB.setUserAddress(
            user.getUserAddress());
    }

    if (Objects.nonNull(user.getUserCode())
        && !"".equalsIgnoreCase(
            user.getUserCode())) {
        depDB.setUserCode(
            user.getUserCode());
    }

    return userRepository.save(depDB);
	}

	@Override
	public void deleteUserById(Long userId) {
		userRepository.deleteById(userId);		
	}

	
}
