import java.util.Scanner;
class Ex1{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the phone number");
    String number=sc.nextLine();
    int count=0;
    
    for(int i=0;i<number.length();i++)
    {
        if(Character.isDigit(number.charAt(i)) )
        {count++;}
        else if(number.charAt(i)=='-')
        {continue;}
        else{
        break;
        }
    }
    if(count==10)
    {
        System.out.println("valid");
    }
    else
        {
            System.out.println("invalid");
        }
    


    
}}