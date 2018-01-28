package OOPS;

public class InherianceExam2 {

	public static void main (String arg[]){
		
		Adder a = new Adder();
		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
		System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
	}
}

class Adder extends Arithmetic{
	
}

class Arithmetic{
	int add(int a, int b){
		return a+b;
	}
}
