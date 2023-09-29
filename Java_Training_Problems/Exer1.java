import java.util.Arrays;
public class Exer1{
public int reverse (int num){
    int rev=0;
        while(num>0)
        {int temp=num%10;
        rev=(rev*10)+temp;
        num=num/10;
    }return  rev;}
//}}



public int[] reverseArray(int[] arr){
 	int []output = new int[arr.length];
     for(int i=0;i<arr.length;i++)
     {
         output[i]=reverse(arr[i]);
     }
	
	
	return output;

}


 int[] sort(int[] arr)
 {
    Arrays.sort(arr);
    return arr;

}
}
