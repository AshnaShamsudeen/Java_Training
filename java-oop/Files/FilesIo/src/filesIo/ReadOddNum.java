package filesIo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadOddNum {

	
	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader=null;
		Scanner sc=null;
	
		try {
			reader= new FileReader("num.txt");
			sc=new Scanner(reader);
			
			while(sc.hasNext()){
				int num=sc.nextInt();
//				
		   System.out.println("number are: "+num);
			//sc.nextLine();
			
		}}
		catch(FileNotFoundException e) {
			e.printStackTrace();
	}
		reader= new FileReader("num.txt");
		sc=new Scanner(reader);
		
		while(sc.hasNext()){
			int num=sc.nextInt();
			{if(num%2!=0)
				System.out.println(num);
			}}
//		finally {
//		try {
//			sc.close();
//			reader.close();
//		}
//			catch(IOException e) {
//				e.printStackTrace();
//				
//				
//			}
//
//	}

	}}
