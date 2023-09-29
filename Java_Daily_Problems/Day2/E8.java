import java.util.Scanner;
class E8{
    public static void main (String []args){
        char input;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter alphabet to check");

        input=sc.next().toLowerCase().  charAt(0);
      
        if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u')
        {
            System.out.println(input +"is vowel");
        }
        else 
        System.out.println(input +"is consonant");


    }
}