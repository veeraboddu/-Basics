package NaveenIntQA;

public class ReverseNumber {
	
	public static void main(String arg[]){
		int gvnnum = 12345;
		int rev =0;
		while(gvnnum!=0){
			rev =  rev*10 + gvnnum%10;
			gvnnum = gvnnum/10;
		}
		System.out.println(rev);
		
	    
		StringBuffer strbuf = new StringBuffer(String.valueOf(rev));
		System.out.println(strbuf.toString());
		
		System.out.println(strbuf.reverse());
	}

}
