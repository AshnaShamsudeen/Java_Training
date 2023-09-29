import java.util.*;
class Ex2{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the orginal string");
    String str1=sc.nextLine();
    System.out.println("enter the string to be checked");
    String str2=sc.nextLine();
    char[] arr1=str1.toCharArray();
    char[] arr2=str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    String new1=new String(arr1);
    String new2=new String(arr2);
    if(new1.length()==0 ||new2.length()==0)
    {
        System.out.println("enter proper input");
    }
    else if(new1.equals(new2))
    {
        System.out.println("this is an anagram");
    }
    else{
        System.out.println("not anagram");
    }
   
}}