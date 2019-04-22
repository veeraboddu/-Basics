
// Factorial 
package Core;

import java.util.Scanner;

public class Factorial {
	int fact=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Factorial number ::");
		int factor =sc.nextInt();
		
		
		int sum = factorial(factor);
		System.out.println("Factorial Sum ::"+sum);

	}
	
	public static int factorial(int fac){
		
		if(fac == 0){
			return 1;
		}
		
		return fac*factorial(fac-1);
	}

}
