package com.crud.Entity;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "CRUD")
public class CRUD {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String feild;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFeild() {
		return feild;
	}
	public void setFeild(String feild) {
		this.feild = feild;
	}
	public CRUD(int id, String name, String feild) {
		super();
		this.id = id;
		this.name = name;
		this.feild = feild;
	}
	public CRUD() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CRUD [id=" + id + ", name=" + name + ", feild=" + feild + "]";
	}
	
	

}
