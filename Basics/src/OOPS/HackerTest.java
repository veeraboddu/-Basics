package OOPS;

import java.io.IOException;

public class HackerTest {

	public static void main(String[] args) {
		
		try{
			new AirJet();
		}catch(IOException e){
			System.out.println("ioexeption thown in tester");
		}
	
	}

}

class Airplane{
	public Airplane()throws IOException{
		System.out.println("Airplane");
		throw new IOException();
	}
}	
	class AirJet extends Airplane{
		public AirJet() throws IOException {
			 super();
			// TODO Auto-generated constructor stub
		}
		
	}
	

