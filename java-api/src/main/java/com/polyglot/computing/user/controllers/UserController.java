package com.polyglot.computing.user.controllers;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.polyglot.computing.user.UserService;
import com.polyglot.computing.user.model.User;

@RestController
@RequestMapping(value="/users")
public class UserController  {
	
	@Autowired
	private UserService userService;

    @RequestMapping(path="", method=RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Collection<User>> getUsers() {
    	return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }
    
    @RequestMapping(path="/{username}", method=RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getUser(@PathVariable("username") String username) {
    	User user = userService.getUser(username);
    	if (user != null) {
    		return new ResponseEntity<>(user, HttpStatus.OK);
    	} else {
    		Map<String, String> result = new HashMap<String, String>();
        	result.put("message", "Data not found");
        	return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
    	}
    		
    }
   
   
}
