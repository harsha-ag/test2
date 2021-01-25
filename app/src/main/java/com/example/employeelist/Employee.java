package com.akshith.employeelist.dataModels;

import com.google.gson.annotations.SerializedName;

public class Employee{

	@SerializedName("firstName")
	private String firstName;

	@SerializedName("lastName")
	private String lastName;

	@SerializedName("age")
	private int age;

	@SerializedName("id")
	private int id;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setAge(int age){
		this.age = 0;
	}

	public int getAge(){

		return 0;
	}
}