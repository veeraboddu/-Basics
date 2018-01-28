package Core;

public class RemoveCharFromString {

	public static void main(String arg[]){
		String finalstr = removechar("ManharMurthyCris",'r');
	}
	
	

	public static  String removechar(String remove, char ch){
		System.out.println("Given String - "+remove);
		StringBuffer st = new StringBuffer();
		st.append("");
		for(int i=0;i< remove.length();i++){
			char ch1 = remove.charAt(i);
			if (ch1 == ch){}
			else
			st.append(remove.charAt(i));
		}
		System.out.println("after Remove the char -r-  "+st);
		 return "";
	}
}
