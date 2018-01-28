package Core;

import java.util.Scanner;

public class PraFactorial {

	// Factorial
	
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		int i1,sum=1;
		System.out.println("Enter int value :");
		i1 = sc.nextInt();
		
		System.out.println("Enter String value :");
		String st = sc.next();
		System.out.println(st);		
		System.out.println(i1);
		
		for(int i=1;i<=i1;i++){
			sum = sum *i;
		}
	    System.out.println("Factorial " +i1+ " is "+sum);
	}

}
