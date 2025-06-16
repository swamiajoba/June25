package com.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {
	
	@NotBlank(message="First Name is mandatory")
	@Size(min=4,max=8,message="Minimum 4 and Maximum 8 characters required")
	private String firstName;

	@NotBlank(message="Last Name is mandatory")
	private String lastName;


	private char gender ;

	@NotBlank(message = "Email Required")
	@Email(message="Please enter valid Email ID")
	private String email;

	@NotEmpty(message = "Select appropriate skills")
	private String[] skillSet;

	@NotBlank(message = "Select city")
	private String city;

	@Min(value = 18,message = "Minimum Age shluld be 18")
	@Max(value = 60,message = "Maximum age should be 60")
	private int age;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String[] skillSet) {
		this.skillSet = skillSet;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
