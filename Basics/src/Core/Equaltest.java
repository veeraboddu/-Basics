package Core;

public class Equaltest {
	
	public static void main(String arg[]){
    String str = "Name";
 String str1 = new String("Name");
 String str2 = new String("Name");
 
 if(str.equals(str1))
     System.out.println("true");
 else
     System.out.println("false");
 
 if(str==str1)
     System.out.println("true");
 else
     System.out.println("false");
 
 if(str2.equals(str1))
     System.out.println("true");
 else
     System.out.println("false");
 
 if(str2==str1)
     System.out.println("true");
 else
     System.out.println("false");

 System.out.println(str.hashCode());
 System.out.println(str1.hashCode());
 
 System.out.println(str2.hashCode());
 System.out.println(str1.hashCode());
 
 
	}
}
