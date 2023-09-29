package filesIo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingFiles {

	public static void main(String[] args) {
		try {
			FileReader reader= new FileReader("hello.txt");
			Scanner sc=new Scanner(reader);
			
			while(sc.hasNextLine()){
				String line=sc.nextLine();
			//sc.nextLine();
			System.out.println(line);
		}}
//		 int ch;
//		 while((ch==reader.read())!=-1) {
//			 System.out.println((char)ch);
//		 }
		 
//			BufferReader in= new BufferReader(reader);
//			System.out.println(in.readLine());
//			System.out.println(in.readLine());
//			System.out.println(in.readLine());
//			 
		// }
			catch(FileNotFoundException e) {
				e.printStackTrace();
		}
			
			
		

	}

}
