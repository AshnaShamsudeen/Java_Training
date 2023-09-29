package exam_trials;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Set<Integer> common=new LinkedHashSet<>();
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the second largest element is: "+Set6_oprn.getSecondLargest(arr));
		// TODO Auto-generated method stub
		System.out.println("the sum off odd element is: "+Set6_oprn.getSumOfOddNumbers(arr));
		System.out.println("the count of prime element is: "+Set6_oprn.getNumberOfPrimes(arr));
		System.out.println();
		System.out.println("enter the array size");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		System.out.println("enter the second array");
		for(int j=0;j<size2;j++) {
			arr2[j]=sc.nextInt();
		}
		//int arr3[]=new int[common.size()];
		int arr3[]=Set6_oprn.getCommonElements(arr,arr2);
		System.out.println("common element array is: "+Arrays.toString(arr3));
		System.out.println("enter the the element to be checked");
		int a=sc.nextInt();
		System.out.println("the occurance of "+a+ " is: "+Set6_oprn.getNumberOfOccurrences(arr,a));
	}

}
