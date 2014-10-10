/**
 * 
 */
package com.haarisinfo.entity;
//karthiktest
/**
 * @author 
 * employee entity class
 */
public class Employee {
	private String name;
	private String email;
	private int year;
	/**
	 * 
	 */
	public Employee() {
	}
	/**
	 * @param name
	 * @param email
	 * @param year
	 */
	public Employee(String name, String email, int year) {
		this.name = name;
		this.email = email;
		this.year = year;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
