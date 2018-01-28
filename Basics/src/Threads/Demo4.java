package Threads;

import java.util.Scanner;
// to shutdown a thread gracefully from another thread we have to use volatile variable  

class process extends Thread{
	private volatile boolean running = true;

	public void run(){
	while(running){
		System.out.println("Hello");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
	
	public void shutdown(){
		running = false;
		
	}
}
public class Demo4 {

	public static void main (String arg[]){
		
		process proc1 = new process();
		proc1.start();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		proc1.shutdown();
		
	
		
	}
}
