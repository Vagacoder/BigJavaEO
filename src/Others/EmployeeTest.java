package Others;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee e1 = new Manager();
		
		System.out.println(e1 instanceof Manager);
		e1.getSalary();
		
		//e1.managerLook();
	}

}
