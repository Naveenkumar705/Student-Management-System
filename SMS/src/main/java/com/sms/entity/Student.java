package com.sms.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {

	@Id
    private int id;
    private String name;
    private int age;
    private String email;
    private String dept;
    
    
	
    public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age, String email, String dept) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.dept = dept;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	} 
    
    
    
    

}
