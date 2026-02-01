package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Devloper;
import com.example.demo.repository.DevloperRepository;

@Service
public class DevloperImpl implements DevloperService {

	@Autowired
	private DevloperRepository dr;
	
	@Override
	public void add(Devloper dev) {
		// TODO Auto-generated method stub
		System.out.println(" imin repo.add");
		dr.save(dev);
		
	}

	@Override
	public List<Devloper> display() {
		// TODO Auto-generated method stub
		System.out.println(" imin repo.display");
		return dr.findAll();
	}

}
