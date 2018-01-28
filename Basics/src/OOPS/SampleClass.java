package OOPS;

public class SampleClass {
	  private static int currentCount = 0;

	  public SampleClass() {
	    currentCount++;
	    System.out.println(currentCount);
	  }

	  public static void increaseCount() {
	    currentCount++;
	    System.out.println(currentCount);
	  }
	  
	  public static void main(String arg[]){
		  increaseCount();
		  
	  }
	  
	}