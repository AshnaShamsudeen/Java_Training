import java.util.Scanner;
class Trial{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines");
       int  lines=sc.nextInt();
        
        for(int row=1;row<=lines;row++)
        {
            for(int col=1;col<=row;col++)
           { System.out.print(row+ " ");}
        

        System.out.println();}
    }
}