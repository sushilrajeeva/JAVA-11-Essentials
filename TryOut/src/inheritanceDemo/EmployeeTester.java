package inheritanceDemo;

public class EmployeeTester {
	
	public static void main(String[] args) {
		PermanentEmployee permanentEmp = new PermanentEmployee(101, "John", 28000.0, "Lead");
		permanentEmp.display();
		System.out.println("Designation: " + permanentEmp.getDesignation());
		permanentEmp.calculateSalaryHike();
		
		System.out.println("----------------");
		TemporaryEmployee tempEmp = new TemporaryEmployee(210, "Ross", 20000.0, 2.5f);
		tempEmp.display();
		System.out.println("Service Duration (in years): " + tempEmp.getServicePeriod());
		tempEmp.calculateSalaryHike();

	}

}
