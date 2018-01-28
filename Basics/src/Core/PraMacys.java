package Core;

import java.util.Arrays;
import java.util.Scanner;

public class PraMacys {
	

	
	public static void main(String arg[]){
		
		//secondLargest();
		//duplicate();
		pyramid();
		
	}
	
	public static void secondLargest(){
		
		System.out.println("Enter array values");
		Scanner input = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i=0;i<5;i++){
			arr[i]= input.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[4]);
	}
	
	public static void duplicate(){
		
		int[] a={2,3,4,2,6,4,5};
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println("Duplicate values"+a[i]);
				}
			}
		}
	}
	
	public static void pyramid(){
		
		for(int i=0;i<5;i++){
			for (int j=5;j>i;j--){
				System.out.print(" ");
			}
			for (int k=1;k<i+1;k++){
				System.out.print(" *");
			}
			System.out.print("\n");
		}
	}

}

