package inheritanceDemo;

class PermanentEmployee extends Employee {
	private String designation;
	private Integer hikePercent;

	PermanentEmployee(int employeeId, String employeeName, Double baseSalary, String designation) {
		super(employeeId, employeeName, baseSalary);
		this.designation = designation;
		this.hikePercent = 12;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getHikePercent() {
		return hikePercent;
	}
    
	public void calculateSalaryHike() {
		Float salaryHike =  (float) (this.getBaseSalary() * (this.getHikePercent()*0.01));
		System.out.println("Salary Hike: "+salaryHike);
	}
	
}