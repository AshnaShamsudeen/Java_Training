package exception;
import java.util.*;

public class UncheckedDemo {

	public static void main(String[] args) {
		int [] arr= new int[4];
		//int [] arr= {1,2,3,4};
		
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter the  array size");
		//int size=sc.nextInt();
		
		System.out.println("enter the  array elements");
		try {
			for(int i=0;i<=arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.err.println("Error: "+ex.getMessage());
		}
		
		
		System.out.println("array");
		for(int num:arr) {
			System.out.println(num);
		}
		

	}

}
