import java.util.Scanner;
class ArrayBasics{
    public static void main(String []args){
        int[] nums = {20,10,55,18,32};
       // for(int index=0;index<nums.length;index++)
       // {System.out.println(nums[index]);}
        

    //for(int item : nums){//
    //    System.out.println(item);//this can't be used to change the value or modify.This can applicable 
    //only applicable in printing
   // }
       for(int index=0;index<nums.length;index++)
       { nums[index]+=5;
        {System.out.println(nums[index]);}}
    }
}
