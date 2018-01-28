package Core;

import java.util.Scanner;

public class PraReverseString {

	public static void main(String arg[]){
		
		Scanner st = new Scanner(System.in);
		System.out.println("Enter the String:");
		String read = st.next();
		System.out.println("Output: "+read);
		System.out.print("Reverse String :");
		for(int i=read.length();i>0;i--){
			System.out.print(read.charAt(i-1));
		}
	}
}
