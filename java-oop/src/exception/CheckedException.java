package exception;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {
		try {
		FileReader reader =new FileReader("hello.txt");
		Scanner scan=new Scanner(reader);
		String line=scan.nextLine();
		System.out.println(line);}
		catch(FileNotFoundException e)
		{System.out.println(e.getMessage());}

	}

}
