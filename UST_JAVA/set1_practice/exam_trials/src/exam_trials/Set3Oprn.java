package exam_trials;

import java.util.Map;
import java.util.*;
public class Set3Oprn {
		static Map<String,Integer> countCities(List<String> str) {
			//
			int count=0;
			Map<String,Integer> mapy=new LinkedHashMap<>();
			
			for(String ch:str) {
				ch=ch.toLowerCase();
				if(mapy.containsKey(ch)) {
					mapy.put(ch, mapy.get(ch)+1);
					
				}
				else {
					mapy.put(ch,1);
				}
				
			}
			return mapy;
			
		}
		public static void main(String[] args) {
			List<String> list=new  ArrayList<>();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of the array");
			int size=sc.nextInt();
			String str1[]=new String[size];
			System.out.println("enter the array elements");
			for(String ch:str1) {
				list.add(sc.next()+sc.nextLine());
			}
			
			//System.out.println(countCities(list));
			countCities(list).forEach((k,v)->System.out.println(k +":"+v));
			


	}

}
