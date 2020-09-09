package inheritanceDemo;

class TemporaryEmployee extends Employee {
	private Float servicePeriod;
	
	TemporaryEmployee(int employeeId, String employeeName, Double baseSalary, Float servicePeriod) {
		super(employeeId, employeeName, baseSalary);
		this.servicePeriod = servicePeriod;
	}

	public Float getServicePeriod() {
		return servicePeriod;
	}

	public void setServicePeriod(Float servicePeriod) {
		this.servicePeriod = servicePeriod;
	}

	public void calculateSalaryHike() {
		Float salaryHike =  (float) (this.getBaseSalary() * (this.getServicePeriod()*2*0.01));
		System.out.println("Salary Hike: "+salaryHike);
	}
	
}
