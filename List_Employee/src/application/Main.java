package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Employee> EmployeeList = new ArrayList<>();
		int EmployeeId;
		String EmployeeName;
		double EmployeeSalary, Percentage, EmployeeNewSalary;
		int IdFilter;
				
		int Quantity;
		
		System.out.println("How many employees will be registred?");
		Quantity = sc.nextInt();
		
		for (int i = 0 ; i < Quantity ; i++) {
			
			System.out.printf("\nEmployee #%d\n", i+1);
			System.out.print("Id: ");
			EmployeeId = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Name: ");
			EmployeeName = sc.nextLine();
			
			System.out.print("Salary: ");
			EmployeeSalary = sc.nextDouble();
			
			EmployeeList.add(new Employee(EmployeeId, EmployeeName, EmployeeSalary));
			
		}
		
		System.out.println("\nEnter the employee id that will have salary increase");
		IdFilter = sc.nextInt();
		
		System.out.println("Enter the percentage: ");
		Percentage = sc.nextDouble();
		
		//Filtrar por Id, a filterEmployee é um ponteiro que aponta para o objeto encontrado(filter) em EmployeeList;
		//stream() permite que EmployeeList seja manipulada por função, no caso o filter.
		
		Employee filterEmployee = EmployeeList.stream().filter(e -> e.getEmployeeId() == IdFilter).findFirst().orElse(null);
		
		if(filterEmployee!= null) {			
			filterEmployee.increaseSalary(Percentage);
		}
		else {
			System.out.println("\nEmployee not found!");
		}
		
		System.out.println("\n------------------------------\n");
		
		for (Employee employee : EmployeeList) {
			
				System.out.println(employee.getEmployeeId() + ", " + employee.getEmployeeName() + ", " + employee.getEmployeeSalary());
			
			
		}
		


		sc.close();
	}

}
