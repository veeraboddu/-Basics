package NaveenIntQA;

public class StringSwap {

	public static void main(String arg[]){
		String a = "Meghana";
		String b = "Sunitha";
		
		System.out.println("a::"+a+"   b::"+b);
		a = a+b;
		b = a.substring(0,a.length()-b.length());
		a =a.substring(b.length());
		System.out.println("a::"+a+"   b::"+b);
	}
}
