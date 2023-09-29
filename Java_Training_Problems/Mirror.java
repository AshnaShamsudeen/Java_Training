import java.util.*;
public class Mirror{
    public static void main(String[] args){

 Scanner sc=new Scanner(System.in);
 System.out.println("enter the string");
 String str1=sc.nextLine();
 StringBuffer mirStr=new StringBuffer(str1);
 mirStr.reverse();
 {
    System.out.println("mirror string is: "+mirStr);
 }
 System.out.println("new string is: "+str1 +"|" +mirStr);
    }
}