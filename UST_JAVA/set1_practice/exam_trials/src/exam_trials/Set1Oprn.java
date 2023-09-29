package exam_trials;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Set1Oprn {
	static String reverseString(String str) {
		StringBuilder str2=new StringBuilder(str);
		StringBuilder rev=str2.reverse();
		return rev.toString();
	}
	static boolean isPalindrome(String str) {
		StringBuilder str2=new StringBuilder(str);
		String rev=(str2.reverse()).toString();
		if(str.equalsIgnoreCase(rev)) {
			return true;
			
		}
		return false;
		
		
	}
	static Map findFrequency(String str) {
		Map<Character ,Integer> freq=new TreeMap<>();
		str=removeSpaces(str);
		char[] ch=str.toCharArray();
		for(char c:ch) {
			if(freq.containsKey(c)) {
				freq.put(c, freq.get(c)+1);
				
				
			}
			else {
				freq.put(c, 1);
			}}
		return freq;
	}
	static String removeSpaces(String str) {
		str=str.replaceAll("\\s","");
	return str;
		
			
		}
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		System.out.println("reversed string is: "+reverseString(str));
		System.out.println("String entered is a palindrome: "+isPalindrome(str));
		System.out.println("frequencies are: "+findFrequency(str));
		System.out.println("new string: "+removeSpaces(str));
	}

}
