import java.util.Scanner;
class ForLoop2{
    public static void main(String []args){
int sum=0;
int avg=0;
Scanner sc=new Scanner(System.in); 
System.out.println("enter 5 numbers");
for(int count=1;count<=5;count++)
{
    int num=sc.nextInt();
    sum=sum+num;  
}
System.out.println("average is"+ sum/5);
System.out.println("sum is" +sum);
}}