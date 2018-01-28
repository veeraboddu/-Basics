package Threads;

public class Demo5 {

	private int count =0;
	public static void main(String[] args) {
		
		Demo5 d5 = new Demo5();
		d5.dowork();

	}
	
	public synchronized void sum(){
		count = count +1;
	}
	public void dowork(){
		
		Thread t1= new Thread(new Runnable() {
			
			public void run() {
				for(int i=0;i<10000;i++){
					sum();
				}
			}
		});
		
Thread t2= new Thread(new Runnable() {
			
			public void run() {
				for(int i=0;i<10000;i++){
					sum();
				}
			}
		});
		
 t1.start();
 t2.start();
 
 try {
	t1.join();
	 t2.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

 
 System.out.println("Count :"+count);
	}

}
