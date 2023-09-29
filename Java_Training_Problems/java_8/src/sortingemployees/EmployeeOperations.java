package sortingemployees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EmployeeOperations {

	public static void main(String[] args) {
Employee1 e1=new Employee1(1001,"shyma",4200);
Employee1 e2=new Employee1(1002,"raju",52000);
Employee1 e3=new Employee1(1003,"navin",4100);
Employee1 e4=new Employee1(1004,"ashna",4400);
Employee1 e5=new Employee1(1005,"aniya",8300);
Comparator<Employee1> compareByName =(emp1,emp2)->( emp1.getEmployeeName().compareTo(emp2.getEmployeeName()));
//Collections.sort(emps,compareByName);

//increase the salary of employees by 10% where salary is more than 50000
//List <Employee1> output2=emps.stream()
//.filter(e->e.getSalary()>50000)
//.map(e-> {
//e.setSalary(e.getSalary()*1.1);
//return e;
//}).collect(Collectors.toList());
//List <Employee1> output3=emps.stream()
//.map(e->{e.setEmployeeName(e.getEmployeeName().toUpperCase());
//return e;}).collect(Collectors.toList());
//output3.forEach(e->System.out.println(e));
//}









//Set<Employee1> empSet =new HashSet<>();
//Set<Employee1> empSet =new TreeSet<>(compareByName);
//
//empSet.add(e1);
//empSet.add(e2);
//empSet.add(e3);
//empSet.add(e4);
//empSet.add(e5);
//empSet.forEach(e->System.out.println(e));
//








	}}
//List<Employee1>emps=new ArrayList<>(List.of(e1,e2,e3,e4,e5));
//Comparator<Employee1> compareBySalary =(emp1,emp2)->(int)(emp1.getSalary()-emp2.getSalary());
//Collections.sort(emps,compareBySalary);
//emps.forEach(e->System.out.println(e));
//
//Comparator<Employee1> compareByName =(emp1,emp2)->( emp1.getEmployeeName().compareTo(emp2.getEmployeeName()));
//Collections.sort(emps,compareByName);
//emps.forEach(e->System.out.println(e));
//
//	}}

////find all the employees having salary more than 40000
//List<Employee1> output1=emps.stream().filter(e->e.getSalary()>=40000).collect(Collectors.toList());
//output1.forEach(e->System.out.println(e));
////increase the salary of employees by 10% where salary is more than 50000
//List <Employee1> output2=emps.stream()
//	.filter(e->e.getSalary()>50000)
//	.map(e-> {
//	e.setSalary(e.getSalary()*1.1);
//	return e;
//	}).collect(Collectors.toList());
//List <Employee1> output3=emps.stream()
//	.map(e->{e.setEmployeeName(e.getEmployeeName().toUpperCase());
//	return e;}).collect(Collectors.toList());
//output3.forEach(e->System.out.println(e));
//	}
//		//forEach(e->System.out.println(e));
////convert each name to upperCase
//
//
//	}
