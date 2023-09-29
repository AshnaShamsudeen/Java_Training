package trial;

import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) {
		String str;
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter a word ");
 str=sc.nextLine();
 StringBuilder str1=new StringBuilder(str);
 String strnew=str1.reverse().toString();
 if(strnew.equalsIgnoreCase(str)) {
	 System.out.println("Paliandrome");
 }else {
	 System.out.println("Not Paliandrome");
 }
 }

}
