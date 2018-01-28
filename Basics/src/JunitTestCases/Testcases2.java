package JunitTestCases;

import java.util.HashMap;
import java.util.Scanner;

public class Testcases2 {


	public static void main(String arg[]){
		
		//HashMap<Character, Integer> freq = new HashMap<>();
		HashMap<Integer, Integer> freq = new HashMap<>();
		//int a[] = {1,2,3,4,10,20,30};  //# random length between 1 to 10,000, random content 1 to 10,000
		//int a[] = {1,2,1,5};
		int size=0,size_b=0,temp=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of First Array a[]: ");
		size = validation(scan);
		
		int[] a =  new int[size];
		System.out.println("Enter First Array a[] elements: ");
		for(int i=0;i<size;i++){
			a[i]=validation(scan);
		}
		mergeCounter (a,freq);
		//int b[] = {20,30,1,2,1,3,4,4,5};
		//int b[] = {1,3,3,4,5};
		System.out.println("Enter Size of Second Array b[]: ");
		size_b =validation(scan);
		int[] b =  new int[size_b];
		System.out.println("Enter Second Array b[] elements: ");
		for(int i=0;i<size_b;i++){
			b[i]=validation(scan);
		}
		mergeCounter (b,freq);
		
		 System.out.println(freq);
		
	}
	
	public static int validation(Scanner scan){
			//System.out.println("Enter Size of First Array a[]: ");
			int temp=scan.nextInt();
			if(temp>=1 && temp <= 10000){
				return temp;
			}else{
				validation(scan);
			}
			return temp;
			
	}
	 public static HashMap mergeCounter(int a[],HashMap freq){
		 int count=1;
		 for(int i=0;i<a.length;i++){
			 count=1;
			 if(freq.containsKey(a[i])){
				 //count = Integer.valueOf(freq.get(a[i]).toString()) + count;
				 count = Integer.valueOf(freq.get(a[i]).toString()) + count;
			 }
			// System.out.println("Array :" +a[i]+" count:"+ count);
			 freq.put(a[i], count);
		 }
		
		 return freq;
	 }
	
	 // check array size it should greater than 0 and not equal to null
	// compare elements of each 
	 

// Output : {1=3, 2=1, 3=2, 4=1, 5=2}
}
