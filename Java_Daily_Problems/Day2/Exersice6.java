import java.util.Scanner;
class Exersice6{
    public static void main (String []args){
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the age");
        age=sc.nextInt();
       
        if(age<=120 && age>=1)
        {
            if(age<=12)
            {
                System.out.println("User is a kid");
            }
            else if(age>=13 && age<=19)
            {
                System.out.println("User is a teen");
            }
            else if(age>=20 && age <=60)
            {
                System.out.println("User is a adult");
            }
            else
                    {
                System.out.println("User is a senior");
                    }
                


        }
        else
        {
                System.out.println("not valid");
            }


    }
    }