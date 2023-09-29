import java.util.Map;
import java.util.TreeMap;
import java.util.*;
public class TwoDigDiff{

public static void main(String[]args){

	Map<Integer,Integer> newDiff=new TreeMap<>();
	Scanner sc= new Scanner(System.in);

	System.out.println("Enter the array size");
	int arr[]=new int[size];

	int size=sc.nextInt();
	System.out.println("Enter the array elements");

	for(int i=0;i<size;i++){
		int size=sc.nextInt();
	}

	System.out.println("Enter the target");
	int target=sc.nextInt();

	for(int i=0;i<size;i++){
		for(int j=i+1;j<size;j++){
			if(arr[i]+arr[j]==target){
				newDiff.put(arr[i],arr[j]);

			}
		}

	}
	for(int key:newDiff.keySet()){
		System.out.println(key+"-"+newDiff.get(key));
	}

	}


}