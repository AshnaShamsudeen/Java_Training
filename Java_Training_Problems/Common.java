import java.util.*;
import java.util.ArrayList;

public class Common{
public static void main(String []args){

	ArrayList<Integer>common=new ArrayList<>();
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the size of first array");
	int a=sc.nextInt();

	System.out.println("Enter the size of second array");
	int b=sc.nextInt();

	int arr1[]=new int[a];
	int arr2[]=new int[b];
	for(int i=0;i<a;i++){
		arr1[]=sc.nextInt();
	}
	for(int j=0;j<b;j++){
		arr2[]=sc.nextInt();
	}
	for(int i=0;i<a;i++){
		for(intj=0;j<b;j++){

			if(arr1[i]==arr[j])

			{
				common.add(arr[i]);
			}
	}
	}
	}
	System.out.println("the new common element array is: ")
	System.out.println(common);
}
}








}









