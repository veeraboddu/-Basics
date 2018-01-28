package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadandWrite {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		// Read ordinary file and write on console
		
		readOrdinaryfile();
		
		writeOrdinaryfile();
		
		// read and write in binary file
		
		//readWriteBinaryfile();
		

	}
	static void readOrdinaryfile()throws IOException{
		String filename="C:/Gene_Regulatary_Backup/Java GPRSTest/workspace/LocalGitRepository/Basics/src/HackerRank/SortIntString.java";
		FileReader fr= new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);

		while(br.readLine()!=null){
			System.out.println(br.readLine());
		}
		
		br.close();
		fr.close();
	}
	
	static void writeOrdinaryfile() throws IOException{
		String filename="C:/Gene_Regulatary_Backup/Java GPRSTest/workspace/LocalGitRepository/Basics/src/HackerRank/sample1.java";
		
		FileWriter fw= new FileWriter(filename);
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("//public class sample{");
		bw.newLine();
		bw.write("//public static void main(String arg[]){");
		bw.newLine();
		bw.write("//System.out.println(welcome to write file)");
		bw.newLine();
		bw.write("//}}");
		
		bw.close();
	}

}
