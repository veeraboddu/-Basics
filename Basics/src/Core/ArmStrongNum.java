package Core;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the 3 digit number");
		Scanner in = new Scanner(System.in);
		int arm = in.nextInt();
		
		int sum=0,rem=0, givennum=arm;
		for(int i=0; arm>0;i++){
			rem = arm%10;
			System.out.println("remainder value : "+rem);
			sum = sum+rem*rem*rem;
			arm= arm/10;
			System.out.println("arm value : "+arm);
			System.out.println("Sum value : "+sum);
			
		}
		System.out.println("arm value : "+givennum);
		if (givennum == sum){
			System.out.println("given number is armstrong "+sum);
		}else
			System.out.println("given number is not an armstrong "+sum);
	}

}
