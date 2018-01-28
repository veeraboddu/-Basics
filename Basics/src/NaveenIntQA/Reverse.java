package NaveenIntQA;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Reverse {
	
	public static void main(String arg[]){
		
		String givenstr = "SELENIUM",rev="";
		
		for(int i=0;i<givenstr.length();i++){
			rev = givenstr.charAt(i)+rev;
		}
		
		System.out.println("Reverse String:: "+rev);
		
		StringBuffer strbuf= new StringBuffer(givenstr);
		System.out.println(strbuf.reverse());
		
	}

}
