/**
 * 
 */
package com.haarisinfo.client;

import java.util.HashMap;

import service.EmployeeService;

import com.haarisinfo.entity.Employee;
import com.haarisinfo.util.KeyboardUtil;

/**
 * @author Standalone client for Library Management System
 */
public class EmployeeClient {

	public static void main(String[] args) {
		EmployeeService<String, Employee> employeeService =new EmployeeService<String, Employee>();
		while (true) {
			int choice = getChoices();
			switch (choice) {
			case 1:
				String email = KeyboardUtil.getString("Enter Email");
				String name = KeyboardUtil.getString("Enter name");
				int year = KeyboardUtil.getInt("Enter Year");
				Employee employee = new Employee(name, email, year);
				employeeService.add(email, employee);

				break;
			case 2:
				String emailId = KeyboardUtil.getString("Enter Email");
				employeeService.getEmployeeBykey(emailId);
				
				/*
				 * get employee whose email is "emailId" and display his/her
				 * information
				 */
				break;
			case 3:
				int opt = getDisplayOptions();
				
				if (opt == 1) {
					//employeeService.getEmployees();
					employeeService.getEmployeesList();
					/*
					 * call a method getEmployees(int... args); without passing
					 * any argument
					 * Display employees returned 
					 */
				} else if (opt == 2) {
					int yr=KeyboardUtil.getInt("Enter joined year");
					//employeeService.getEmployees(yr);
					employeeService.getEmployeesList(yr);
					/*
					 * call a method getEmployees(int... args); by passing year
					 * Display employees returned 
					 */
				} else if (opt == 3) {
					int startyear=KeyboardUtil.getInt("Enter Start year");
					int endyear =KeyboardUtil.getInt("Enter End year");
					//employeeService.getEmployees(startyear,endyear);
					employeeService.getEmployeesList(startyear,endyear);
					/*
					 * call a method getEmployees(int... args); by passing "start year" and "end year"
					 * Display employees returned 
					 */
				}
				break;
			case 4:
				/* end */
				System.exit(1);
			}
		}
	}

	/**
	 * Method to print options
	 * 
	 * @return selected choice
	 */
	private static int getChoices() {
		System.out.println("1.Store employee");
		System.out.println("2.Get Employee based on key");
		System.out.println("3.Get Employees");
		System.out.println("4.Exit");
		return KeyboardUtil.getInt("Enter choice[1/2/3/4]");
	}

	/**
	 * Display options
	 * 
	 * @return selected choice
	 */
	private static int getDisplayOptions() {
		System.out.println("1.Get All Employees ");
		System.out.println("2.Get Employees who have joined in a given year");
		System.out
				.println("3.Get Employees who have joined between specified years");
		return KeyboardUtil.getInt("Enter choice[1/2/3]");
	}
}
