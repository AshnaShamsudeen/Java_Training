import java.util.*;
class ExereMain{
    public static void main(String[] args){
        Exer1 rev1=new Exer1();
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the size of the array");
    int num=sc.nextInt();
    int[] arr=new int [num];
    System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();}
        
        int[] result=new int[num];
        result=rev1.reverseArray(arr);
        System.out.println("reversed array is: ");
        for(int nums:result){
            System.out.println(nums+" ");

        }
        result=rev1.sort(result);
        System.out.println("sorted array is: ");
        for(int nums:result){
            System.out.println(nums+" ");

        }
    }}
    
   