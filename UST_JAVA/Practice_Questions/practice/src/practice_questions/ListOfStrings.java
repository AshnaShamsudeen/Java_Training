package practice_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfStrings {

	public static void main(String[] args) {
		List<String> chars= Arrays.asList("apple","java","realme","ant","antenna");
		List<String> output= new ArrayList<>();
		for(String n:chars) {
			if(n.startsWith("a") && n.length()>4) {
				output.add(n);
			}
		}
		System.out.println(output);

	}

}
