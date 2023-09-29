import java.util.Scanner;
class StringArray{
    public static void main (String []args){
        String[] names= {"ASH","SHYMA","Charu"};
        for(int id=0; id<names.length; id++)
       { System.out.println(names[id]);}
       for (String name:names){
           System.out.println(name);
       }
    }
}