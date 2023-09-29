import java.util.Scanner;
class StringReverse{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string to be reversed");
        String str=sc.nextLine();
        
        
        //String str="hello world";
        //StringBuffer revStr= new StringBuffer(str);  
        StringBuilder revStr= new StringBuilder(str);
        revStr.reverse();
        System.out.println(revStr);
    }
}