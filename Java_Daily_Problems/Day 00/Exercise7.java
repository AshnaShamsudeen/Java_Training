import java.util.Scanner;
class Exercise7{
    public static void main (String []args){
        int num1,num2,num3;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 3 integers to compare");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        if(num1>num2 && num1>num3)
        {
            System.out.println(num1 +"is greater");
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println(num2 +"is greater");
        }
        else
        {
            System.out.println(num3+"is greater");
        }


    }
    }