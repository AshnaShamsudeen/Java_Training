package employeeList;
import java.util.*;



public class EmployeeMain1 {

	
		static Scanner scan=new Scanner(System.in);
		public static Employee1 insertEmployee() throws InvalidInputException{
			System.out.println("Enter the employee details: ");
			
			
			System.out.println("employee id: ");
			long id=scan.nextLong();
			if(id< 10000 || id> 99999) {
				throw new InvalidInputException("Id should be a 5 digit positive value");}
			
			System.out.println("employee name: ");
			String name=scan.next()+scan.nextLine();
			if(name.length()<3) {
				throw new InvalidInputException("name should have minimum 3 character");}
			
			System.out.println("salary: ");
			double salary=scan.nextDouble();
			if(salary<=10000 && salary>=200000) {
				throw new InvalidInputException("salary should be more than 10000 and less than 200000");}
				
			Employee1 e = new Employee1(id,name,salary);
			return e;
		
		}
		public static List<Employee1> incrementSal(List<Employee1> array){
			List<Employee1> emp = new ArrayList<>();
			for(Employee1 e:array) {
				if(e.getSalary() > 50000) {
					double salary=e.getSalary()*1.10;
					e.setSalary(salary);
				}
			} return emp;
				
		}
		public static void main(String[] args) {
			List<Employee1> emp=new ArrayList<>();
			System.out.println("enter the no. of employees");
			int n=scan.nextInt();
			try {
				for(int i=0;i<n;i++) {
					emp.add(EmployeeMain1.insertEmployee());
				}} 
			catch(InvalidInputException e) {
				System.err.println(e);}
			
			for(Employee1 e:emp) {
				System.out.println(e);
				
			}
			System.out.println("employees having salary more than 40000");
			for(Employee1 e: emp)
			{
				if(e.getSalary() > 40000) {
					System.out.println(e);
					
				}
			}
					//System.out.println("no employees with salary greater than 40000");
				
			
				for(Employee1 e1: EmployeeMain1.incrementSal(emp)) {
					System.out.println(e1);
					
				}
			
				
			
			
		}
		
		
		
		}
		
		
		

	


