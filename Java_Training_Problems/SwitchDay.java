import java.util.Scanner;
class SwitchDay{
    public static void main (String []args){
        int day;
        String output="";
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the day");

        day=sc.nextInt();

        switch(day){
            case 1: output="Monday-its time to start the week";
                break;
             case 2: output="Tuesday-4 days to go";
                break;
             case 3: output="Wednesday-3 days to go";
                break;
             case 4: output="Thursday-2 days to go";
                break;
             case 5: output="Friday-1 day to go";
                break;
             case 6: output="Saturday-Enjoy your weekend";
                break;
             case 7: output="Sunday-Plan for the upcoming weekend";
                break;
             default: output="Invalid option selected";
                break;

        }
        
     System.out.println(output);
    }
}