import java.util.Scanner;
class Calculator{
    public static void main (String []args){
        int choice=0;
        int num1;
        int num2;
        double output=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number");

        num1=sc.nextInt();
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the second number");
        num2=scan.nextInt();
        System.out.println("1:Multiple"+ '\n'+ "2:Add"+ '\n' +"3:Subtract"+ '\n' +"4:Divide"+'\n');
         
       
        Scanner scan1= new Scanner(System.in);
        System.out.println("enter the choice");
        choice=scan1.nextInt();

        switch(choice){
            case 1: output= num1*num2;
                break;
             case 2: output=num1+num2;
                break;
             case 3: output=num1-num2;
                break;
             case 4: output=(double)num1/num2;
                break;
             default: 
                break;

        }
        
     System.out.println(output);
    }
}