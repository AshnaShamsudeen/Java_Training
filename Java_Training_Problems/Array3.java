import java.util.Scanner;
class Array3{
    public static void main(String []args){
        int sum=0;
     
     Scanner sc= new Scanner(System.in);
	System.out.println("enter the size of array:");
    int size= sc.nextInt();
    int[] nums =new int[size] ;
        Scanner scan= new Scanner(System.in);
	System.out.println("Input 5 numbers:");
    for(int index=0;index<nums.length;index++)
    { nums [index] = scan.nextInt();}
    System.out.println("numbers entered are: ");
    for(var num : nums)
    {System.out.println(num+"\t");}
    for(int index1=0;index1<nums.length;index1++)
     sum=sum+nums[index1];
	float avg=sum/5;
	System.out.println("Sum ="+sum);
	System.out.println("Avg="+avg);
    }
}