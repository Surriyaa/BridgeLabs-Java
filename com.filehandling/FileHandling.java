
import java.io.File;
public class FileHandling {

	public static void main(String[] args) {
//		File file=new File("C:\\Users\\ASUS\\Desktop\\File\\surriyaa\\gold");
//		boolean p=file.exists();
//		System.out.println("file Exist: "+p);
//		if(p==false) {
//			file.mkdirs();
//			p=file.exists();
//			System.out.println("file Exist: "+p);
//		}
		
//		File file=new File("C:\\Users\\ASUS\\Desktop\\File\\test.txt");
//		boolean p=file.exists();
//		if(p==false)
//		{
//			try {
//				boolean f=file.createNewFile();
//				System.out.println("file  created "+f);
//			}
//			catch(Exception e) {
//				System.out.println(e);
//			}
//		}
		
		File file=new File("C:\\Users\\ASUS\\Desktop\\");
		File[] f=file.listFiles();
		
		for(File s:f)
			if(s.isFile()) {
				String name=s.getName();
				int ind=name.lastIndexOf(".");
				String extention=name.substring(ind+1);
				String fName=name.substring(0, ind);
				System.out.println(extention+" is the extention for "+fName);
							}
		}

	

}
