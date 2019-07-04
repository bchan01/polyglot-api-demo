package com.polyglot.computing.user.controllers;


import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class HomeController  {

    @RequestMapping(path="", method=RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Map<String, String>> home() {
    	Map<String, String> result = new HashMap<String, String>();
    	result.put("message", "Hello Java");
    	return new ResponseEntity<>(result, HttpStatus.OK);
    }
    
   
}
