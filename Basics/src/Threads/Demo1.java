package Threads;

class Runner extends Thread{
	
	@Override
	public void run() {
		for (int i=0;i<10;i++){
			System.out.println("Hellow manhar how are you.. this is Java Value i "+i);
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		super.run();
	}
	
}
public class Demo1 {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.start();

		
		Runner run2 = new Runner();
		run2.start();
	}

}
