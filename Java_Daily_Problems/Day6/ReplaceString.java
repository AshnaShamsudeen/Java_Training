import java.util.Scanner;
class ReplaceString
{
    public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the orginal string");
    String str=sc.nextLine();

    System.out.println("enter start position");
    int start=sc.nextInt();
    System.out.println("enter end position");
    int end=sc.nextInt();
    System.out.println("replace with: ");
    String str2=sc.next()+sc.nextLine();
    StringBuffer repStr=new StringBuffer(str);
    repStr.replace(start,end,str2);
    System.out.println("new string is: " +repStr);

}
}