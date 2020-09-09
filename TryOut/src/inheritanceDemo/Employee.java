package inheritanceDemo;

class Employee {
	private Integer employeeId;
	private String employeeName;
	private Double baseSalary;

	// Parameterized constructor
	Employee(int employeeId, String employeeName, Double baseSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.baseSalary = baseSalary;
	}
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void display() {
		System.out.println("Employee details");
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Base Salary: " + baseSalary);
	}
	
}
