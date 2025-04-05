package com.ems.main;

import java.util.Scanner;

import com.ems.dao.EmployeeDao;
import com.ems.model.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("user enter choice");
		System.out.println("press 1 for insert");
		System.out.println("press 2 for read");
		System.out.println("press ");
		int choice =sc.nextInt();
		switch (choice) {
		case 1:{
			if(new EmployeeDao().insertEmployee(new Employee(101,"somya","software engg")))
				System.out.println("employee details inserted");
			else System.out.println("failed to insert employee details");
		}
		break;
		case 2: new EmployeeDao().readEmployees();
		default:
			break;
		}
	}
	

}
