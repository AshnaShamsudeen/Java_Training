import java.util.Scanner;
class Ex3{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the orginal string");
    String str1=sc.nextLine();
    System.out.println("enter the string to be checked");
    String str2=sc.nextLine();
    if(str1.length()==0 ||str2.length()==0)
    {
        System.out.println("enter proper input");
    }
    else if(str1.equals(str2))
    {
        System.out.println("this is an anagram");
    }
    else{
        System.out.println("not anagram");
    }
   
}}