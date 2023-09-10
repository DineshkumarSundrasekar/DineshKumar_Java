package com.gl.question1;

import java.io.Serializable;

public class Project implements Serializable{
	
	String code;
	String name;
	int strength;
	public Project(String code, String name, int strength) {
		super();
		this.code = code;
		this.name = name;
		this.strength = strength;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	@Override
	public String toString() {
		return "ProjectDetails [code=" + code + ", name=" + name + ", strength=" + strength + "]";
	}
	public Project() {
		super();
	}
	
}
