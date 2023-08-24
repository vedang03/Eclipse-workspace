package com.aurionpro.model;

public class Employee {

	private int employeeid;
	private String employeeName;
	private int managerid;
	private String employeeDepartment;
	private String doj;
	private double employeeSalary;
	private int departmentId;
	private String employeeCommision;

	public Employee(String employeeName, String employeeDepartment) {
		super();
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
	}

	public Employee(String employeeName, int managerid) {
		super();
		this.employeeName = employeeName;
		this.managerid = managerid;
	}

	public Employee(int employeeid, int managerid) {
		super();
		this.employeeid = employeeid;
		this.managerid = managerid;
	}

	public Employee(String employeeDepartment, double employeeSalary) {
		super();
		this.employeeDepartment = employeeDepartment;
		this.employeeSalary = employeeSalary;
	}

	

	public Employee(String employeeDepartment, double employeeSalary, String employeeCommision) {
		super();
		this.employeeDepartment = employeeDepartment;
		this.employeeSalary = employeeSalary;
		this.employeeCommision = employeeCommision;
	}
	
	

	public Employee(double employeeSalary,int employeeid) {
		super();
		this.employeeSalary = employeeSalary;
		this.employeeid = employeeid;
	}

	public Employee(double employeeSalary) {
		super();
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getManagerid() {
		return managerid;
	}

	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getEmployeeCommision() {
		return employeeCommision;
	}

	public void setEmployeeCommision(String employeeCommision) {
		this.employeeCommision = employeeCommision;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeeName=" + employeeName + ", managerid=" + managerid
				+ ", employeeDepartment=" + employeeDepartment + ", doj=" + doj + ", employeeSalary=" + employeeSalary
				+ ", departmentId=" + departmentId + ", employeeCommision=" + employeeCommision + "]";
	}

}
