package Core;

public class PraBubbleSort {
	// sorting algorithum
	public static void main(String arg[]){
		 bubbleSort();
	}
	
	static void bubbleSort(){
		
		int arry1[] ={5,9,3,6,1,4};
		int temp=0;
		for(int i=0;i<arry1.length;i++){
			for (int j=0;j<arry1.length-1;j++){
				if(arry1[j]>arry1[j+1]){
					temp=arry1[j];
					arry1[j]=arry1[j+1];
					arry1[j+1] =temp;
				}
			}
		}
		
		for(int i=0;i<arry1.length;i++){
			System.out.print(" "+arry1[i]);
		}
	}
	

}
