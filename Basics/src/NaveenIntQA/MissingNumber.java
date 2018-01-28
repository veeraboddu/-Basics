package NaveenIntQA;

public class MissingNumber {

	public static void main(String arg[]){
		int a[] = {1,2,3,4,6};
		 
		// formula n*(n+1)/2 - sum a[]
		int n=a.length,sum=0,formula=0;
		System.out.println("n::"+n);
	     formula = n*((n+1)/2);
	     System.out.println("formula::"+formula);
		
	     for(int i=0;i<a.length;i++){
	    	 sum = sum + a[i];
	     }
	     System.out.println("sum::"+sum);
	     System.out.println(sum - formula);
	     
	     // with out formula
	     
	     int sum0=0,sum1=0;
	 	for(int i=0;i<a.length;i++){
	 		sum0 = sum0 + a[i];
	 	}
	 	 System.out.println("sum0::"+sum0);
	 	
	 	for(int i=1;i<=6;i++){
	 		sum1 = sum1 + i;
	 	}
	 	 System.out.println("sum1::"+sum1);
	 	 
	 	System.out.println("missing number::"+ (sum1-sum0));
	}
	
}
