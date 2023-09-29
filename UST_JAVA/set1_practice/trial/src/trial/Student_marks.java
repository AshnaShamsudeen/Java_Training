package trial;
import java.util.*;

public class Student_marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Student1> st1=new ArrayList<>();
		System.out.println("enter the number of students");
		int n=sc.nextInt();
		System.out.println("enter the student details:");
		for(int i=0;i<n;i++) {
			System.out.println("enter the students id:");
			int id=sc.nextInt();
		System.out.println("enter the student name:");
		String name=sc.next()+sc.nextLine();
		
		System.out.println("enter the students cgpa:");
		float cgpa=sc.nextFloat();
		Student1 s=new Student1(name,id,cgpa);
		st1.add(s);
		}
		
		
		Comparator<Student1>comp=(s1,s2)->{
			if(s1.getCgpa()==s2.getCgpa()) {
			return s1.getName().compareTo(s2.getName());	
			}
			else if(s1.getCgpa()==s2.getCgpa() && s1.getName().equals(s2.getName())) {
				return (int)( s1.getId()-s2.getId());
			}
			return (int)(s2.getCgpa()-s1.getCgpa());
		};
		System.out.println(st1);
		Collections.sort(st1,comp);
		System.out.println(st1);
		
	}

}
 