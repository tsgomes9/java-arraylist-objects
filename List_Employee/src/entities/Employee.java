package entities;

public class Employee {

	private int EmployeeId;
	private String EmployeeName;
	private double EmployeeSalary;
	
	public Employee (int EmployeeId, String EmployeeName, double EmployeeSalary) {
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName;
		this.EmployeeSalary = EmployeeSalary;
	}
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int EmployeeId) {
		this.EmployeeId = EmployeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String EmployeeName) {
		this.EmployeeName = EmployeeName;
	}
	public double getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(double EmployeeSalary) {
		this.EmployeeSalary = EmployeeSalary;
	}
	public void increaseSalary(double Percentage) {
		this.EmployeeSalary = EmployeeSalary + (EmployeeSalary * Percentage/100);
	}
	
	
}
