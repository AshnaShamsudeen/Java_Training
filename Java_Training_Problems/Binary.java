
import java.util.*;
class Binary{
    public static void main (String[]args){
        String binary=" ";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the decimal value to be converted: ");
        int decimal=sc.nextInt();
        if(decimal<0)
        {
            System.out.println("enter proper input not negative number ");
        }
        else if(decimal==0)
        {
            System.out.println("enter proper input not zero ");
        }
        else{
        while(decimal>0)
        {
            int a=decimal%2;
            binary=a+binary;
            decimal=decimal/2;}

        System.out.println(binary);
        int count=0;
        
        for(int i=0;i<binary.length();i++)
        {
            if(binary.charAt(i)=='0')
            {
                count++;
            }
            
        
        }System.out.println(count);
        System.out.println("number of zeroes in "+binary +"is: " +count);

        }
    }


    }

