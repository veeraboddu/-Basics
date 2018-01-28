package NaveenIntQA;

public class SwapTwoNumber {
	
	public static void main (String arg[]){
		int a =100,b=200;
		System.out.println(" + and - operatror ");
		System.out.println("a::"+a+"   b::"+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a::"+a+"   b::"+b);
		
		System.out.println(" * and / operatror ");
		System.out.println("a::"+a+"   b::"+b);
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println("a::"+a+"   b::"+b);
		
		System.out.println(" XOR ^ operator ");
		System.out.println("a::"+a+"   b::"+b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a::"+a+"   b::"+b);
	}

}
