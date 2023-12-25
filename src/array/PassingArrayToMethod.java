package array;

public class PassingArrayToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee[]= new Employee[2];
		
		System.out.println("============================Adding records============================");
		//passing array to method
		addEMployeeDetails(employee);
		
		System.out.println("============================Reading records============================");
		//passing array to a method
		printEMployeeDetails(employee);
	}
	
	public static void addEMployeeDetails(Employee [] employee) {
		
		for(int i=0;i<employee.length;i++) {
			
			employee[0]= new Employee(10,"Abc");
			employee[1]= new Employee(11,"Xyz");
		}
	}
	
	public static void printEMployeeDetails(Employee [] employee) {
		
		for(Employee emp: employee) {
			System.out.println(emp.getId()+" "+emp.getName());
		}
	}

}
