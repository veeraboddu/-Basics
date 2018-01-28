package Core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f1 = new File("C:\\Users\\bodduv\\Desktop\\manhar.txt");
		if(!f1.exists()){
			f1.createNewFile();
		}
		
		FileOutputStream fos = new  FileOutputStream(f1);
		String st = "Hello manhar how are you what are your plans for Thanks giving day";
		byte[] b=st.getBytes();
		fos.write(b);
		
		FileInputStream fis = new FileInputStream(f1);
		int i=0;
		while((i=fis.read())!=-1){
	    	  System.out.print((char)i);
	        }
        fis.close();
		
	}

}
