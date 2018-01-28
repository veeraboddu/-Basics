package Core;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class PraPalindrome {
	
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Palindrome");
		String palString =sc.next();
		System.out.println(palString);
		String rev="";
		for(int i=0;i<palString.length();i++){
			
			rev = palString.charAt(i)+rev;
		}
		System.out.println(rev);
		
		if(palString.equals(rev)){
			System.out.println("Given String is Palindrom "+rev);
		}
				
				
	}

}
