package Core;

import java.util.Arrays;
import java.util.Scanner;

public class Pra3rdLargestInArray {

	public static void main (String arg[]){
		
		System.out.println("Enter array values");
		Scanner input = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i=1;i<5;i++){
			arr[i]= input.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[4]);
		
	}
}
