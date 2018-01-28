package NaveenIntQA;

public class SpecialCharRemove {
	
	public static void main(String arg[]){
		
		String gvnstr = "$$@Welcome@@$ To@$%$$#% Java&%%& Selenium#%# Session$$%$";
		
		// To remove to special char we need to use regular expression.
		//[^a-bA-B0-9]  user str.replaceAll(regExp,replacestr) ^ not operator exclude those 
		gvnstr = gvnstr.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(gvnstr);
		
		String meghan="梅根";
		String murthy = "穆尔蒂";
		String sunita = "苏尼塔";
		String fulname = meghan + "meghan "  + murthy+ " murthy " + sunita + " sunita" ;
		System.out.println(fulname);
		
		fulname = fulname.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(fulname);
	}

}
