package Practice;

public class OnetotenWithoutLoop {

	public static void main(String arg[]){
		printOnetoTen(1);
	}
	
	public static void printOnetoTen(int n){
		
		if (n <= 10) {
			System.out.println(n);
			printOnetoTen(n + 1);
		}
	}
}
