package Core;

public class PraPrintTriangle {
	
	public static void main(String arg[]){
		for (int i = 4; i >= 1; i--) {              
		    for (int j = 1; j < i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = i; k <= 4; k++) {                    
		        System.out.print(k+"");
		    }                                  
		    System.out.println();            
		}
	}
	/*
	 output
	 	
	   4
	   34
	  234
	 1234
	 
	 */
	 
	 
	/*
	public static void main(String[] args) {
	    for (int i = 1; i <= 4; i++) {
	        for (int j = 4; j > i; j--) {
	            System.out.print(" ");
	        }
	        for (int k = i; k >= 1; k--){
	            System.out.print(k + "");
	        }
	        System.out.println();
	    }
	}
	
	
	output :
		   1
		   21
		  321
		 4321
		*/
		

}
