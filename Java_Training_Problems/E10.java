import java.util.Scanner;
class E10{
    public static void main(String []args){
int count=0;
int sum=0;
int avg=0;
Scanner sc=new Scanner(System.in); 
System.out.println("enter 5 numbers");
while(count<5)
{
    int num=sc.nextInt();
      
    if(num<0)
    
    {count++;
        break;}
    sum=sum+num;
    count++;
    
}
System.out.println("average is"+ sum/count);
System.out.println("sum is" +sum);
}}