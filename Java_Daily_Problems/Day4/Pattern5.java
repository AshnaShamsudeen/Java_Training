import java.util.Scanner;
class Pattern5{
    public static void main (String []args){
        int lines;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines");
        lines=sc.nextInt();
        
        for(int row=lines;row>=1;row--)
        {
            for(int col=1;col<=row;col++)
            {System.out.print(lines-(col-1)+ " ");}
        

        System.out.println();}
    }
}