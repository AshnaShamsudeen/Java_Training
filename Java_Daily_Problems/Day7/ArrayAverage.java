import java.util.*;
class ArrayAverage{
    //public static void main(String []args){
        public int[] getArrayValues(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the array");
        
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }return arr;
    }
    public String findAverage(int []arr){
        float sum=0;
        float avg=0;
        String output="";
        if(arr.length==0){
            output="Array is empty";}
        for(int nums:arr)
        {
            if(nums<0)
            {
                output="Give proper positive integer value";
                break;
            }else{
                sum=sum+nums;
                avg=sum/arr.length;
                output="The average value is: "+avg;

            }
            
        }return output;
        
        

    }

}