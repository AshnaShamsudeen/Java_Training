package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
//		//writing an object
//		Employee emp=new Employee(1001,"Ram",4500);
//		FileOutputStream outputStream=null;
//		ObjectOutputStream objectStream=null;
//		try {
//		 outputStream=new FileOutputStream("employee.data");
//		 objectStream=new ObjectOutputStream(outputStream);
//		objectStream.writeObject(emp);
//		
//		
//		}
//		catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				outputStream.close();
//				objectStream.close();
//			}
//			catch(IOException e) {
//			System.err.println(e);}
//	}
//Reading an object
		FileInputStream inputStream=null;
		ObjectInputStream objectInputStream=null;
		try {
	 inputStream=new FileInputStream("employee.data");
	 objectInputStream=new ObjectInputStream(inputStream);
	 Employee emp=(Employee) objectInputStream.readObject();
	 System.out.println(emp);
		}
		catch(IOException |ClassNotFoundException e) {
			System.err.println(e);}
		
	}

}
