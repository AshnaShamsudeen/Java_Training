import java.util.Scanner;
class ArrayNew{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
	System.out.println("enter the size of array:");
    int size= sc.nextInt();
        String[] names =new String [size] ;
    
        
        Scanner scan= new Scanner(System.in);
	System.out.println("Enter the names:");
    for(int index=0;index<names.length;index++)
    { names[index]= scan.next() + scan.nextLine();}
        System.out.println("the names are:-");
       for (String name : names){
           System.out.println(name);
       }
    }
}