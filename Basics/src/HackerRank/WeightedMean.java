package HackerRank;

import java.util.Scanner;

public class WeightedMean {

	public static void main(String arg[]){
		/*
		 5
10 40 30 50 20
1 2 3 4 5
		 */
		int n =0;
		float arr_weight=0,sum_weight=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N Value :");
		n = scan.nextInt();
		float a[] = new float[n];
		float b[] = new float[n];
		
		
		System.out.println("Enter Elements of Array :");
		for(int i=0;i<n;i++){
			a[i]= scan.nextFloat();
		}
		
		System.out.println("Enter Weight of Array :");
		for(int i=0;i<n;i++){
			b[i]= scan.nextFloat();
		}
				
		for(int i=0;i<n;i++){
			
			arr_weight = arr_weight + (a[i]*b[i]); 
			sum_weight = sum_weight + b[i];
			
		}
		System.out.println(arr_weight+ " "+sum_weight);
		System.out.println(arr_weight/sum_weight);
		
	}
}
