package Core;

public class PraFibonacci {

	// 1 1 2 3 5 
	public static void main (String arg[]){
		int a=1,b=1,c=0;
		System.out.print(a +" "+b);
		
		for(int i=0;i<5;i++){
			c = a +b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
