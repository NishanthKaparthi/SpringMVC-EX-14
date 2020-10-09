package com.montrealcollege.exercise13.model;

import javax.validation.constraints.*;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
public class Student {
	//when we pass the empty value from the website to @NotNll field,
	//it will pass the value as empty string not as null string,
	//so spring will not raise the error because its not the null string
	//to make NotNull work use the @Size annotation with MIN value
	@NotNull
	@Size(min = 1, message = "first name cannot be empty")
//	@Min(value = 1, message = "first name cannot be empty")
	private String firstName;
	@NotNull
	@Size(min = 1, message = "last name cannot be empty")
	private String lastName;
	@NotNull
	@Min(value = 18, message = "age should be more than 18")
	private Integer age;
	@NotNull
	@Size(min = 1, message = "address cannot be empty")
	private String address;
	@NotNull
	@Size(min = 1, message = "phoneNumber cannot be empty")
	private String phoneNumber;
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName, String lastName, Integer age, String address, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
