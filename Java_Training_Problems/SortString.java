import java.util.Scanner;
class SortArray{

    public static void main(String []args){

        int temp=0;

        Scanner scan= new Scanner(System.in);
	    System.out.println("enter the number of string:");
        int size=scan.nextInt();

        String [] arr= new String[size];

        Scanner sc= new Scanner(System.in);
	    System.out.println("enter the array elements:");
        

        for(int index=0;index<arr.length;index++)
        {
             arr[index]=sc.nextLine();
        }
        System.out.println("array before sorting:");
        for(String arr2 : arr)
        {
            System.out.println(arr2);
        }
        for(int index=0;index<(arr.length-1);index++)
        { 
        for(int j=(index+1);j<arr.length;j++)
         if(arr[index]>.compareTo(arr[j])>=1)
        
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