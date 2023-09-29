import java.util.Scanner;
class Q1{

    public static void main(String []args){

     
        String result=" ";
        Scanner scan= new Scanner(System.in);
	    System.out.println("enter the number of employees:");
        int employee=scan.nextInt();

        int [] emp= new int[employee];

        Scanner sc= new Scanner(System.in);
	    System.out.println("enter the employee id's:");
        for(int index=0;index<emp.length;index++)
        {
             emp[index]=sc.nextInt();
        }
        
        for(int i=0;i<(emp.length-1);i++)
        { 
        for(int j=(i+1);j<emp.length;j++)
        { if(emp[i]==emp[j])
        {result="false";
        break;}
        else
        {result="true" ;}
        }break;
        
        }  
    System.out.println(result );
    
}}