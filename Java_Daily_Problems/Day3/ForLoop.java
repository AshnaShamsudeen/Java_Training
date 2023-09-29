import java.util.Scanner;
class ForLoop{
    public static void main(String []args){
int input=5;
Scanner sc= new Scanner(System.in);
input=sc.nextInt();

for(int count=1;count<=10;count++)
{System.out.println(count +" X "+ input +" = " + count*input);}
    }
}
