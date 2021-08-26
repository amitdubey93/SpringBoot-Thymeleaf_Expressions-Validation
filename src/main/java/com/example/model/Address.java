package com.example.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString*/

public class Address {
	
	@NotBlank
	private String state;
	
	@NotBlank
	private String street;
	
	@Size(min=6, max=6, message = "Should be of 6 characters")
	private String zipCode;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", street=" + street + ", zipCode=" + zipCode + "]";
	}
	public Address(String state, String street, String zipCode) {
		super();
		this.state = state;
		this.street = street;
		this.zipCode = zipCode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
