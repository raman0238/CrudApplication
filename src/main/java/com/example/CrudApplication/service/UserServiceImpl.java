package com.example.CrudApplication.service;

import com.example.CrudApplication.dao.UserDao;
import com.example.CrudApplication.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserDao userDaoImpl;
    @Override
    public List<User> getAllUsers() {
        return userDaoImpl.getAllUsers();
    }

    @Override
    public Object addUser(User user) {
        return userDaoImpl.addUser(user);
    }

	public  void updateUser(User user, String id) {
		 userDaoImpl.updateUser(user,id);
	}

	@Override
	public void deleteUser(Integer id) {
		userDaoImpl.deleteUser(id);
	}
}
