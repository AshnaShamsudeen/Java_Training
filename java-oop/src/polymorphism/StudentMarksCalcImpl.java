package polymorphism;
import java.util.*;

public class StudentMarksCalcImpl {
	 public static void main(String []args){
		 	Scanner sc=new Scanner(System.in);
		 	System.out.println("enter the stream");
	        String input =sc.nextLine();
	        StudentMarks stream=new StudentMarks();
			var output1 =stream.calculateMarks(50.0,45.5,98.0,76.0);
			var output2 =stream.calculateMarks(50,60,40,20);
			var output3 =stream.calculateMarks(50.0f,40.5f,9.8f,7.6f);
			var output4 =stream.calculateMarks(50.0,45.5,98,76);
	       
			System.out.println("output : "+output1);
			 System.out.println("output : "+output2);
			 System.out.println("output : "+output3);
			 System.out.println("output : "+output4);
			 

	    }


	}



