import java.util.Scanner;
class Pattern2{
    public static void main (String []args){
        int lines;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines");
        lines=sc.nextInt();
       
        for(int row=1;row<=lines;row++)
        {
            for(int col=1;col<=row;col++){
            char ch=row%2==0 ? '#' : '*';
        
        System.out.print(ch + " ");
        }

        System.out.println();
    }
}
}