package com.example.CrudApplication.dao;

import com.example.CrudApplication.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Repository
public class UserDaoImpl implements UserDao {
    public static  final List<User> userList =  new ArrayList<>(Arrays.asList(new User("Raman", 32 , "CET"),
                                                 new User("rakesh" , 33 , "CET")));
    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public Object addUser(User user) {
        System.out.println("user added ");
        return userList.add(user);
    }

	@Override
	public void updateUser(User user, String id) {
		 userList.forEach(o -> {
			if(o.getRollno() == Integer.parseInt(id)) {
				o.setDepartment(user.getDepartment());
				o.setName(user.getName());
				o.setRollno(user.getRollno());
			}
		});
		
	}

	@Override
	public void deleteUser(Integer id) {
		Optional<User> user = userList.stream().filter(o -> o.getRollno() == id ).findFirst();
		if( user.isPresent()) {
			userList.remove(user);
		}else {
			System.out.println("No user present with given id");
		}
	}
}
