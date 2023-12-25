package array;

public class DriverTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this is array of user defined objects
		Employee [] employee = new Employee[] 
				{new Employee(4,"Bhagyashri"), new Employee(5,"Priyanka"), new Employee(6,"Prajakta")};
		
		// iterating array using enhanced for loop
		for(Employee emp: employee) {
			System.out.println("Id is : "+emp.getId()+"  Name is : "+emp.getName());
		}
	}

}
