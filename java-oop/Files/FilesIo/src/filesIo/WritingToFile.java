package filesIo;
import java.io.FileWriter;
import java.io.IOException;
public class WritingToFile {

	public static void main(String[] args) {
		FileWriter writer=null;
		try {
			//open the file in write mode
			// writer = new FileWriter("data.txt");
			
			//open the file in append mode
		 writer = new FileWriter("data.txt",true);
		String line="\nkerala is a beautiful place";
		writer.write(line);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
			}
			catch(IOException e)
		{
			e.printStackTrace();
		}
		}
	}

}
