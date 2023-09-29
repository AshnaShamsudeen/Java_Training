import java.util.Scanner;
class StringEq{

    public static void main(String []args){

	    System.out.println("enter 2 strings");
        Scanner sc= new Scanner(System.in);
        Scanner scan= new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=scan.nextLine();
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
         System.out.println("a index from last:-" +str1.LastIndexOf("a"));
           System.out.println("index of a :-" +str1.IndexOf(str2));
          System.out.println("the difference is:-" +str1.compareTo(str2));
          System.out.println("the difference is:-" +str1.compareTo(str2));
          System.out.println("the difference is:-" +str1.compareTo(str2));
        
         

    }
}

