package filehandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopiying {
// file copiyig done with input stream and output stream
	public static void main(String[] args) {
		try {
			InputStream input=new FileInputStream("C:\\Users\\ASUS\\Desktop\\Challa Kutty.mp4");
			OutputStream output=new FileOutputStream("C:\\Users\\ASUS\\Desktop\\Challa Kutty Copy.mp4");
			
			int data=input.read();
			while(data!=-1) {
				output.write(data);
				data=input.read();
			}
			
			output.flush();
			input.close();
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
