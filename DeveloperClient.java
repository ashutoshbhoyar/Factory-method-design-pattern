package Factory_method_design_pattern;

public class DeveloperClient {
	public static void main(String[] args) {
		//If we want object of Web developer
		Employee employee = EmployeeFactory.getEmployee("web developer");
		System.out.println(employee.salary());
		
		//If we want object of Android developer
		Employee employee2 = EmployeeFactory.getEmployee("android developer");
		System.out.println(employee2.salary());
	}
}