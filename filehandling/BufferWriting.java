package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriting {

	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\ASUS\\Desktop\\file\\buffer.txt");
		
		try {
			file.createNewFile();
			FileWriter fwriter=new FileWriter(file,true);
			BufferedWriter bWriter=new BufferedWriter(fwriter);
			
			bWriter.write(65);
			bWriter.newLine();
			bWriter.write("Java ");
			bWriter.newLine();
			bWriter.write("is ");
			bWriter.newLine();
			bWriter.write("a OOPS Language");
			bWriter.flush();
			bWriter.close();
			
			FileReader fReader =new FileReader(file);
			BufferedReader bReader =new BufferedReader(fReader);
			
			String str=bReader.readLine();
			int line=0,sen=0,word=0,ch=0;
			while(str!=null) {
				String[] sentence=str.split("[.]");
				String words[]=str.split("[ ]");
				word+=words.length;
				sen+=sentence.length;
				ch+=str.length();
				System.out.println(str);
				str=bReader.readLine();
				line++;
			}
			System.out.println("No of lines ="+line);
			System.out.println("No of sen ="+sen);
			System.out.println("No of words ="+word);
			System.out.println("No of character ="+ch);


			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
