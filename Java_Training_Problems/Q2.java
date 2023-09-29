import java.util.Scanner;
class Q2{
    
    public static void main(String []args){
        Scanner scan= new Scanner(System.in);
	System.out.println("enter the number of words:");
        int size=scan.nextInt();
       String result=" ";
    String[] strings= new String[size];
    Scanner sc= new Scanner(System.in);
	System.out.println("enter the words");
    for(int index=0;index<strings.length;index++)
    { strings[index]=sc.next()+sc.nextLine();}
    result=strings[0];
     for(int i=0;i<(strings.length-1);i++)
        {
        
         if(result.length() >=strings[i].length())
    {
    result=strings[i];
    }
         }
    System.out.println("the shortest element is " + result);
    } }
