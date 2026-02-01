package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.annotation.Nonnull;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Backend")
public class Backend extends Devloper{

	

	@JsonFormat
	private List<String> list;
	@Nonnull
	private float bonus;

	public Backend() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Backend(Integer id, String name, float exp, String techstack, String projectname) {
		super(id, name, exp, techstack, projectname);
		// TODO Auto-generated constructor stub
	}

	public Backend(List<String> list, float bonus) {
		super();
		this.list = list;
		this.bonus = bonus;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
}
