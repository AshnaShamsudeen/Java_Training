import java.util.Scanner;
class Prime{
    public static void main (String []args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        num=sc.nextInt();
        for(int limit=2;limit<=num/2;limit++)
        {
            if(num%limit!=0)
           
            {System.out.print(num +"is a prime number");
            break;}

            else
            {
                System.out.print(num + "is not a prime number ");
                break;
            }
        }}}
       