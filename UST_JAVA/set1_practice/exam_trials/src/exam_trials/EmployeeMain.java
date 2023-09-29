package exam_trials;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
	static List<Employee> sortSalary(List<Employee>employeeList){
		Comparator<Employee> comp=(emp1,emp2)->(int)(emp1.getSalary()-emp2.getSalary());
		Collections.sort(employeeList,comp);
		return employeeList;
		
	}
	static List<Employee> sortCity(List<Employee> employeeList){
		Comparator<Employee> comp2=(emp1,emp2)->{
			if((emp1.getCity()).equalsIgnoreCase(emp2.getCity()))
				{return (emp1.getEmployeeName()).compareTo (emp2.getEmployeeName());}
			else
				{return (emp1.getCity()).compareTo(emp2.getCity());}
		};
	 Collections.sort(employeeList,comp2);
	 return employeeList;
	}
	static List<Employee> findEmployee(String city,List<Employee>employeeList){
		List<Employee> news=new ArrayList<>();
		for(Employee em:employeeList) {
			if(em.getCity().equalsIgnoreCase(city)) {
				news.add(em);
			}
		}
		return news;
		
	}
	static Map<String,Integer> countCities(List<Employee> employeeList){
		int count;
		Map<String,Integer> mapy=new LinkedHashMap<>();
		for(Employee em:employeeList) {
			if(mapy.containsKey(em.getCity())) {
				mapy.put(em.getCity(), mapy.get(em.getCity())+1);
			}
			else {
				mapy.put(em.getCity(), 1);
			}
		}
		return mapy;
	}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Employee m1=new Employee(12,"shy", 12000,"ekm");
		Employee m2=new Employee(13,"abhi",13000,"ekm");
		Employee m3=new Employee(14,"ash",14000,"kollam");
		Employee m4=new Employee(15,"V",16000,"mlpm");
		List<Employee> emp=Arrays.asList(m1,m2,m3,m4);
		System.out.println("employee list sorted based on salary: \n"+sortSalary(emp));
		System.out.println("employee list sorted based on city: \n"+sortCity(emp));
		System.out.println("employees from the same place: \n"+findEmployee("ekm",emp));
		Map<String,Integer> mapy=countCities(emp);
		mapy.forEach((k,v)->System.out.println(k +":"+ v));

	}

}