package NaveenIntQA;

public class MinMaxNumber {
	
	public static void main(String arg[]){
		int a[]={-10,-3,-90,10,20,30,55};
		int min = a[0];
		int max = a[0];
		
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max = a[i];
			}
			if(a[i]<min){
				min = a[i];
			}
		}
		
		System.out.println("Smallest Number"+min);
		System.out.println("Biggest Number"+max);
	
	}

}
