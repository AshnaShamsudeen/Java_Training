package filesIo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		FileReader reader=null;
		Scanner sc=null;
		FileWriter writer1=null;
		FileWriter writer2=null;
		
		

		try {
			reader= new FileReader("num.txt");
			sc=new Scanner(reader);
			writer1 = new FileWriter("odd.txt");
			writer2 = new FileWriter("even.txt");
			while(sc.hasNext()){
				int num=sc.nextInt();
				if(num%2!=0) {
					System.out.println("odd nos:");
					System.out.print(num);
					writer1.write(num+" ");}
				
				
			else
				
			{
				System.out.println("even nos:");
				System.out.print(num);
				writer2.write(num+" ");}
			
				
			
				
				
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
	}
		
		
		
		
		finally {
			sc.close();
			try {
				writer1.close();
				writer2.close();
			    reader.close();
			
		}
			catch(IOException e) {
					e.printStackTrace();
					
				
			}
		
	}

	}}
