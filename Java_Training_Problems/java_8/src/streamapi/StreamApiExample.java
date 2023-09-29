package streamapi;






import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



//public class StreamApiExample {
//
//
//
//// list of numbers
//// find all the even numbers
//// multiply the even numbers by 3
//// add the numbers after multiplication
//// show the final output    
//
//
//
//static List<Integer> evenNums (List<Integer> nums){
//	List <Integer> temp=new ArrayList <>();
// for (int num:nums) {
//if(num%2==0)
//{temp.add(num);
//}
//}return temp;}
//static List<Integer> multiply (List<Integer> even){
//List <Integer> temp=new ArrayList <>();
//for(int num:even) {
//int tempNum=num*3;
// temp.add(tempNum);
// }return temp;}
//static int add(List<Integer> mulBy3){
// int sum=0;
//for(int num:mulBy3) {
//sum=sum+num;
//}return sum;
//}
//static void show(int sum){
//System.out.println("Sum of even numbers "+sum);}
//
// public static void main(String[] args) {
//List<Integer> nums=Arrays.asList(3,6,5,4,2,7);
//System.out.println("The array is: "+nums);
// List<Integer> even =StreamApiExample.evenNums(nums);
// System.out.println("The even no's are: "+even);
//List<Integer> mulBy3 =StreamApiExample.multiply(even);
//System.out.println("The new array is: "+mulBy3);
// int sum =StreamApiExample.add(mulBy3);
// StreamApiExample.show(sum);}
//
//
//
//}





public class StreamApiExample {
	
	public static void main(String[] args) {
		
		List<Integer> arr = List.of(3, 6, 5, 4, 2, 7);
		System.out.println("Original List "+arr);
		List<Integer> evens = arr.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Filtered List "+evens);
		List<Integer> multiplied = evens.stream().map(i->i*3).collect(Collectors.toList());
		System.out.println("Modified List "+multiplied);
		int result = multiplied.stream().reduce((x,y)->x+y).get();
		System.out.println("Final output");
		System.out.println(result);
		
	}
	
}
