import java.util.Scanner;
class E9{
    public static void main (String []args){
        int num1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the digit");

        num1=sc.nextInt();
        if(num1%3==0 && num1%5==0)
        {
            System.out.println("FizzBuzz");
        }
        else if(num1%5==0)
        {
            System.out.println("Buzz");
        }
        else if(num1%3==0)
        {
            System.out.println("Fizz");
        }
        else
        {
            System.out.println(num1);
        }
    }

    }