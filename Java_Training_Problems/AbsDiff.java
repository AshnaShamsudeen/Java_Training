import java.util.*;
import java.util.TreeMap;
import java.util.Map;
public class AbsDiff{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
Map<Integer,Integer> diff=new TreeMap<Integer>();
System.out.println("enter the first array size");
int a=sc.nextInt();
System.out.println("enter the second array size");
int b=sc.nextInt();
int arr1[]=new int[a];
int arr2[]=new int[b];
System.out.println("enter the positive first array elements"); 
for(int i=0;i<a;i++){
arr1[i]=Math.abs(sc.nextInt())*-1;
}
System.out.println("enter the negative second array elements"); 
for(int j=0;j<a;j++){
arr2[j]=Math.abs(sc.nextInt());
}
for(int i=0;i<a;i++){
for(int j=0;j<b:j++){
if(Math.abs((arr[i]-arr[j])<=(arr[i]-arr[j+1]))){
diff.put(arr[i],arr[j]);
}
}
}
for(int key:diff.keySet()){
		System.out.println(key+"-"+diff.get(key));
	}

}
}