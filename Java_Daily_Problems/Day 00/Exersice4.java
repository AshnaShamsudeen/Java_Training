import java.util.Scanner;
class Exersice4{
    public static void main (String []args){
        int num1,num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 2 integers to compare");

        num1=sc.nextInt();
        num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.println(num1 +"is greater");
        }
        else if(num2>num1)
        {
            System.out.println("num1"+num2 +"is greater");
        }
        else
        {
            System.out.println("both are equal");
        }


    }

}