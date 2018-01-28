// Author - Veera
package Core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LastFiveLinesRead {

	 public static void main(String[] args) throws Exception {
		    // Read a file 
		    File f = new File("C:\\Gene_Regulatary_Backup\\Java GPRSTest\\workspace\\Basics\\src\\Core\\aspera-scp-transfer.log");
	        FileInputStream in = new FileInputStream(f);
	        BufferedReader br = new BufferedReader(new InputStreamReader(in));
	        ArrayList<String> lines = new ArrayList<String>();
	        	        String tmp;
	        
	        // Read line and added to the Arraylist
	        while ((tmp = br.readLine()) != null) {
	            lines.add(tmp);
	        }
	        
	        // Read last 5 lines from given log file and display on console
	        for (int i = lines.size()-5; i < lines.size(); i++) {
	            System.out.println(lines.get(i-1));
	        }
	 }       
}
