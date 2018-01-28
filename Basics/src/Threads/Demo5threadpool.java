package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class processor implements Runnable {
	
	private int id;
	
	public processor(int id){
		this.id =id;
	}
	
	public void run() {
	System.out.println("Startint: "+id);
	
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.out.println("Completed: "+id);
	}
}
public class Demo5threadpool {

	
	public static void main (String arg[]){
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++){
			executor.submit(new processor(i));
		}
	
	  executor.shutdown();
	  System.out.println("All tasks submitted");
	  try {
		executor.awaitTermination(1, TimeUnit.DAYS);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
