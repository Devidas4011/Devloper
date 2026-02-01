package com.example.demo.model;

import java.util.List;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
public class Frontend extends Devloper{
	
	
	private List<String> list;

	public Frontend() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Frontend(Integer id, String name, float exp, String techstack, String projectname) {
		super(id, name, exp, techstack, projectname);
		// TODO Auto-generated constructor stub
	}

	public Frontend(List<String> list) {
		super();
		this.list = list;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

}
