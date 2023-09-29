import java.util.Scanner;
class MethodClass{
    static String findShortestWord(String []arr)
    {
        String shorts= arr[0];
     for(int i=0;i<=(arr.length-1);i++)
        {
        
         if(shorts.length() >=arr[i].length())
    {
    shorts=arr[i];
    }
    }
    return shorts;
    }
    public static void main(String []args){
        String[] str1={"Ashna","shahna","Shyma","Abhi"};
         String[] str2={"Shafna","Charusree","abhirami","priya"};
         String[] str3={"vel","shanu","althaf","bhargavi"};

         String short1=findShortestWord(str1);
         String short2=findShortestWord(str2);
         String short3=findShortestWord(str3);

    System.out.println("the shortest element is " + short1);
    System.out.println("the shortest element is " + short2);
    System.out.println("the shortest element is " + short3);
    } }
