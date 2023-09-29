import java.util.Scanner;
class ArrayMax{
    
    public static void main(String []args){
        Scanner scan= new Scanner(System.in);
	System.out.println("enter the array size:");
        int size=scan.nextInt();
    int[] numbers= new int[size];
    
    
    int max=numbers[0];
    int max2=numbers[0];
    Scanner sc= new Scanner(System.in);
	System.out.println("enter the array elements:");
    for(int index=0;index<numbers.length;index++)
    { numbers[index]=sc.nextInt();}
    
    for(int num: numbers)
    {if(num>max)
    {max=num;}}
    System.out.println("the highest element is: "  +max);
    for(int num : numbers)
    {if(num>max2 && num!= max ){
        max2=num;}
    }
      System.out.println("the  2nd highest element is: "  +max2);
      for(int num: numbers)
    {if(num<max)
    {min=num;}}
    System.out.println("the lowest element is: "  +min);
    for(int num : numbers)
    {if(num>max2 && num!= max ){
        max2=num;}
    }
      System.out.println("the  2nd highest element is: "  +max2);

}}