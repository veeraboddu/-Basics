package JunitTestCases;

import java.util.HashMap;
public class Codexercise {

	public static void main(String arg[]){
		
		//HashMap<Character, Integer> freq = new HashMap<>();
		HashMap<Integer, Integer> freq = new HashMap<>();
		//int a[] = {1,2,3,4,10,20,30};  //# random length between 1 to 10,000, random content 1 to 10,000
		int a[] = {1,2,1,5};
		
		mergeCounter (a,freq);
		
		//int b[] = {20,30,1,2,1,3,4,4,5};
		int b[] = {1,3,3,4,5};
		mergeCounter (b,freq);
		
		 System.out.println(freq);
		
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
	// 
	 
}
