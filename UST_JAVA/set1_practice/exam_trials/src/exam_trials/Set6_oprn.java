package exam_trials;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set6_oprn {
	static int getSecondLargest(int[] arr) {
		int smallest;
		int new_smallest;
		int second_small;
		smallest=arr[0];
		second_small=smallest;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>smallest) {
				smallest=arr[i];
			}}
		for(int i=0;i<arr.length;i++) {
			if((arr[i]>second_small) && (arr[i]!=smallest)) {
				second_small=arr[i];
			}
		}
		return second_small;
	}
	static int getSumOfOddNumbers(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				sum=sum+arr[i];
				
			}
		}
		return sum;
	}
	static int getNumberOfPrimes(int[] arr) {
		int count=0;
		
		for(int num:arr) {
			int c=0;
			for(int j=1;j<=num;j++) {
			if((num%j)==0)
			{
				c++;
			}
		}
			if(c==2) {
				count+=1;}
		}
		return count;}
	
	static int[] getCommonElements(int[] arr1, int[] arr2){
		Set<Integer> common=new LinkedHashSet<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					common.add(arr1[i]);
					
				}
				
			}
			
		}
	int arr3[]=new int[common.size()];
	int k=0;
	for(int num:common) {
		arr3[k]=num;
		k++;
	}
		
	return (arr3);
	}
	static int getNumberOfOccurrences(int[] arr, int num) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				count++;
				
			}
		}
		return count;
	}
	
	
	
	}


