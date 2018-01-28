package Core;

public class SynThread extends Thread{
	public static long visit=0; 
	public void run(){
		SynBlock.visit++;
		System.out.println("SynBlock.visit :"+SynBlock.visit);
	}
	
	public static void main(String arg[]){
		for (int i=0;i<25; i++){
			Thread t1Thread = new SynThread();
			t1Thread.start();
		}
	}
}
