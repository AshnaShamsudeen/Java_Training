package practice_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Common_elements {
	static void commonElements(String arr1[],String arr2[]) {
		Set<String> commmon=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					commmon.add(arr1[i]);
				}
			}
		}
		//for(String str1:commmon) {
			System.out.println(commmon +" ");
		}
		
	//}

	public static void main(String[] args) {
		String arr1[]= {"Article","for","Geeks","for","Geeks"};
		String arr2[]= {"Article","Geeks","Geeks"};
		commonElements(arr1,arr2);
		
	
	}
 
}
