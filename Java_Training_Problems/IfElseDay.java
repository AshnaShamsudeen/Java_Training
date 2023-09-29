import java.util.Scanner;
class IfElseDay{
    public static void main (String []args){
        int day;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the day");

        day=sc.nextInt();
       if(day<=0 || day>=8)
       {System.out.println("Invalid");}
       else{
        if(day==1)
        {
            System.out.println("Monday-its time to start the week");
        }
        else if(day==2)
        {
            System.out.println("Tuesday-4 days to go");
        }
        else if(day==3)
        {
            System.out.println("Wednesday-3 days to go");
        }
        else if(day==4)
        {
            System.out.println("Thursday-2 days to go");
        }
        else if(day==5)
        {
            System.out.println("Friday-1 day to go");
        }
        else if(day==6)
        {
            System.out.println("Saturday-Enjoy your weekend");
        }
       
        else
        {
            System.out.println("Sunday-Plan for the upcoming weekend");
        }}

    }
    }