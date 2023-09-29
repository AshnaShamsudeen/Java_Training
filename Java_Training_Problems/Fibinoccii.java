import java.util.Scanner;
class Fibinoccii{
    public static void main (String []args){
        int num1=1;
        int num2=1;
        int limit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        limit=sc.nextInt();
        System.out.print(num1+ "\t");
       while(num2<limit){
           System.out.print(num2+ "\t");
           
           num2=num1+num2;
           num1=num2-num1;


       }}}