package OOPS;

public class InheritanceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird b1= new Bird();
		b1.fly();
		b1.sing();
		b1.walking();
	}

}

class Animal{
	void walking(){
		System.out.println("I am walking");
	}
}

class Bird extends Animal{
	void fly(){
		System.out.println("I am flying");
	}
	
	void sing(){
		System.out.println("I am singing");
	}
}
