import java.util.Scanner;
class SortArray{

    public static void main(String []args){

        int temp=0;

        Scanner scan= new Scanner(System.in);
	    System.out.println("enter the array size:");
        int size=scan.nextInt();

        int [] arr= new int[size];

        Scanner sc= new Scanner(System.in);
	    System.out.println("enter the array elements:");
        

        for(int index=0;index<arr.length;index++)
        {
             arr[index]=sc.nextInt();
        }
        System.out.println("array before sorting:");
        for(int arr2 : arr)
        {
            System.out.println(arr2);
        }
        for(int index=0;index<(arr.length-1);index++)
        { 
        for(int j=(index+1);j<arr.length;j++)
         if(arr[index]>arr[j])
        
        {
            temp=arr[index];
            arr[index]=arr[j];
            arr[j]=temp;
        }

        
        }
        System.out.println("Sorted array is:" );
        for(int arr1 : arr)
        {
            System.out.println(arr1);
        }
    
    }
}