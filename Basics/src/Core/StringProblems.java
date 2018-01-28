package Core;

import static org.testng.AssertJUnit.assertEquals;
import java.util.HashMap;
import java.util.Scanner;

import org.testng.annotations.Test;

public class StringProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//countRepeatChar();
		//countRepeatString();
		//reverseString();

	}
	
	// Check reverse a string or countRepeatChar
			@Test
			public static void countRepeatChar_TestCase() throws Exception {
					//String inputString = "madam";
					String inputString = "MurthySunithaMeghana";
					int expectedResult = 1;
					int actaulResult = countRepeatChar(inputString);
					assertEquals(actaulResult, expectedResult);
			}

	private static int countRepeatChar(String inputString) {
		// TODO Auto-generated method stub
		//String myfamily = "MurthySunithaMeghana";
		HashMap<Character, Integer> hm= new HashMap<Character,Integer>();
		int count =0,result=1;
		for(int i=0;i<inputString.length();i++){
			count=1;
			if(hm.containsKey(inputString.charAt(i))){
				count=hm.get(inputString.charAt(i))+count;
			}
			hm.put(inputString.charAt(i), count);
		}
		System.out.println("Each char repeat count"+hm+"\n");
		return result;
		
	}
	
	// Check reverse a string or countRepeatString
		@Test
		public static void countRepeatString_TestCase() throws Exception {
				//String inputString = "madam";
				String ar[] = {"meghana","murthy","manhar","cris","venkat","devi","ishaan","govind","rakesh","murthy","meghana","meghana","meghana"};
				int expectedResult = 4;
				int actaulResult = countRepeatString(ar);
				assertEquals(actaulResult, expectedResult);
		}
	
	private static int countRepeatString(String ar[]) {
		//String ar[] = {"meghana","murthy","manhar","cris","venkat","devi","ishaan","govind","rakesh","murthy","meghana","meghana","meghana"};
	    HashMap<String, Integer> hm = new HashMap<String, Integer>();
	    int count =0;
	    for(int i=0;i<ar.length;i++){
	    	count =1;
	    	if(hm.containsKey(ar[i])){
	    		//System.out.println("hm.get(ar[i]) : "+hm.get(ar[i]));
	    	 count = hm.get(ar[i]) + 1;
	    	}
	    	
	    	hm.put(ar[i], count);
	    	if(hm.get(ar[i])==4){
	    		return hm.get(ar[i]);
	    		//System.out.println("Check giving String required count : "+hm.get(ar[i]));
    		}
	    }
	    return 0;
	   // System.out.println("Count of Repeat String :"+hm+"\n");
	}
	
	// Check reverse a string or Palindrome
	@Test
	public static void reverseString_Test() throws Exception {
			String inputString = "madam";
			String expectedResult = "madam";
			String actaulResult = (String)reverseString(inputString);
			assertEquals(actaulResult, expectedResult);
	}
	private static String reverseString(String read) {
	//	Scanner st = new Scanner(System.in);
	//	System.out.println("Enter the String:");
	//	String read = st.next();
		String s2="";
		System.out.println("EnterString: "+read);
		for(int i=read.length();i>0;i--){
			s2=s2+read.charAt(i-1);
			//System.out.print(read.charAt(i-1));
		}
		if(read.equals(s2))
			return(s2);
		else
			return("Not a Palindrome");
	}
	
	// Remove char test case
	
	@Test
	public static void removeCharOneLine_TestCase() throws Exception {
			String inputString = "test";
			String expectedResult = "es";
			String actaulResult = (String)removeCharOneLine("test", "t");
			assertEquals(actaulResult, expectedResult);
	}
	
	public static String removeCharOneLine(String input, String result){
		StringBuilder str = new StringBuilder();
		return input.replaceAll(String.valueOf(result), "");
		
	}

}
