package Core;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class MultiThread implements Executor {

	public static void main(String arg[]){
		
		
		
	}

	@Override
	public void execute(Runnable command) {
		// TODO Auto-generated method stub
		MultiThread mt = new MultiThread();
		Executor e = Executors.newCachedThreadPool();
		e.execute((Runnable) mt);
	}
}
