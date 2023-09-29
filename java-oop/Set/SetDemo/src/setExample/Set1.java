package setExample;
import java.util.LinkedHashSet;
import java.util.Set;
//import java.util.Hashset;
import java.util.TreeSet;



public class Set1 {

	public static void main(String[] args) {
		//Set<Integer> nums = new HashSet<>();//print based on the hash code
		//Set<Integer>nums = new TreeSet<>();
		Set<Integer>nums = new LinkedHashSet<>();//print in the order which we entered
		
		//in tree set all the elements is sorted by default
		//LinkedHasSet follows the order of insertion
		
		nums.add(10);
		nums.add(100);
		nums.add(20);
		nums.add(500);
		nums.add(150);
		nums.add(20);
		nums.add(500);
		nums.add(150);
		
		System.out.println(nums);

	}

}
