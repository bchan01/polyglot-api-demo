package com.polyglot.computing.user;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.polyglot.computing.user.model.User;

@Service
public class UserService {
	
	final Map<String, User> users;
	
	public UserService() {
		
		users = new HashMap<>();
		users.put("bchan", new User("bchan", "Brian", "Chan"));
		users.put("rfederer", new User("rfederer", "Roger", "Federer"));
		
	}
	
	public Collection<User> getUsers() {
		return users.values();		
	}
	
	
	public User getUser(String username) {
		return users.get(username);		
	}

}
