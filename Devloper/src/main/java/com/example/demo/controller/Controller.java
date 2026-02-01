package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Backend;
import com.example.demo.model.Devloper;
import com.example.demo.model.Frontend;
import com.example.demo.service.DevloperService;

@RestController
public class Controller {

	@Autowired
	DevloperService ds;
	
	@PostMapping("add/front")
	public void add(@RequestBody Frontend end) {
		ds.add(end);
		
	}
	
	@PostMapping("add/back")
	public void add(@RequestBody Backend back) {
		ds.add(back);
		
	}
	
	@GetMapping("display")
	public List<Devloper> display(){
		
		return ds.display();
		
		
		
	}
	
}
