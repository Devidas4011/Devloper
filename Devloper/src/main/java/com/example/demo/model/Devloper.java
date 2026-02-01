package com.example.demo.model;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="dtype",discriminatorType = DiscriminatorType.STRING)
public class Devloper {
	
	@Id
	private Integer id;
	
	private String name;
	private float exp;
	private String techstack;
	private String projectname;
	public Devloper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Devloper(Integer id, String name, float exp, String techstack, String projectname) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
		this.techstack = techstack;
		this.projectname = projectname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getExp() {
		return exp;
	}
	public void setExp(float exp) {
		this.exp = exp;
	}
	public String getTechstack() {
		return techstack;
	}
	public void setTechstack(String techstack) {
		this.techstack = techstack;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	@Override
	public String toString() {
		return "Devloper [id=" + id + ", name=" + name + ", exp=" + exp + ", techstack=" + techstack + ", projectname="
				+ projectname + "]";
	}

}
