package com.example.CrudApplication.dao;

import com.example.CrudApplication.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    Object addUser(User user);

	void updateUser(User user, String id);

	void deleteUser(Integer id);
}
