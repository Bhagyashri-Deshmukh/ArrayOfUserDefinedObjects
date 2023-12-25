package array;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this is array of user defined objects
		Employee [] employee = new Employee[3];
		
		employee[0] = new Employee(1,"Bhagyashri");
		employee[1] = new Employee(2,"Neha");
		employee[2] = new Employee(3,"Nikhil");
		
		// iterating array using for loop
		for(int i=0;i<employee.length;i++) {
			System.out.println("Id is : "+employee[i].getId()+"  Name is : "+employee[i].getName());
		}
	}

}
