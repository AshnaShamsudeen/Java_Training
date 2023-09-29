package streamapi;

import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<Integer> nums=List.of(2,3,4,5,6);
		//Square all the number in the list
		
		//map (Function)
		
		//T apply (T arg)
		
		nums.stream().filter(e->e%2!=0).map(e->e*e).forEach(e->System.out.println(e));
		//convert each name to upperCase
		
		List<String> names= List.of("ammu","shyma","yedhu","appukuttan","unni.p.p");
		names.stream().map(e->e.toUpperCase()).forEach(e->System.out.println(e));
		
	}

}
