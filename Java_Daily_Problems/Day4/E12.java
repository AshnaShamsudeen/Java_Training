import java.util.Scanner;
class E12{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines");
       int  lines=sc.nextInt();
        
        for(int row=1;row<=lines;row++)
        {
            for(int col=1;col<=row;col++)
            if(col%2==0)
           { System.out.print( "1" + " ");}
           else
           {System.out.print( "0" +" ");}
        

        System.out.println();}
    }
}