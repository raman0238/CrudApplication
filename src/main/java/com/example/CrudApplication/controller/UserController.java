package com.example.CrudApplication.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrudApplication.model.User;
import com.example.CrudApplication.service.UserService;	

@RestController
public class UserController {

	@Autowired
	private UserService userServiceImpl;

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}

	@GetMapping("/user")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> userList = userServiceImpl.getAllUsers();
		return new ResponseEntity<>(userList, HttpStatus.ACCEPTED);
	}

	@PostMapping("/user")
	public ResponseEntity<?> addUser(@RequestBody User user) {
		return new ResponseEntity<>(userServiceImpl.addUser(user), HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/user/{id}")
	public void updateUser(@RequestBody User user, @PathVariable("id") String id){
		  userServiceImpl.updateUser(user, id);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		userServiceImpl.deleteUser(id);
	}

}