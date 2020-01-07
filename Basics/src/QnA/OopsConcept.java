package QnA;

public class OopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		   An abstract class can have a constructor(s), but the constructor(s) must be implemented. 
		   An Interface must not have a constructor at all.
		  
		   Why can't we instantiate abstract class?

example 1: abstrcat class can have constructors 
abstract class Person {
   private String name;
   public Person(String name) {
      this.name = name;
   }
}

class SoccerPlayer extends Person {
   public SoccerPlayer(String name) {
     super(name);
   }
}
Person p = new SoccerPlayer("Ronaldo");

Example-2
abstract class Foo
{
  public Foo()
  {
    // Do Stuff
  }
}

class Bar extends Foo
{
  public Bar()
  {
    super();
  }
}

What are transient variables?
. What is serialization?
transient is a Java keyword which marks a member variable not to be serialized when it is persisted to streams of bytes. 
When an object is transferred through the network, the object needs to be 'serialized'. Serialization converts the object state 
to serial bytes.

Q. Static - no need to create a instance it exists in perminent memorey
   // to execute each and every time static block will be used , to initialize the static variable we will use static block
    static int name ;
   static {
    name ="Murty";
   }
   
   // static method 
    // with out create the instance we can execute the method with class .
    public static void main (String arg[]){
    
    }

1. Abstract 
- Abstract class not possible to create an instance
- Abstract class will have abstract method and not abstract methods
- In order to use an abstract method, you need to override that method in sub class. (abstract void myMethod();)

// Here class is abstract
public abstract class AbstractSuperClass {
	// data members cant be abstract
	public int a = 10;
	
	// myMethod() is an abstract method
	abstract void myMethod();
	
	// myMethod(int x) is not an abstract method. Its a concrete method
	void myMethod(int x){
		System.out.println("I am in Super class and I am not an abstract method. I am a concrete method");
	}

}

// Inheriting the AbstractSuperClass class
public class AbstractChildOneClass extends AbstractSuperClass{

	public static void main (String [] args){

                // Here we cannot instantiate the AbstractSuperClass class but we can instantiate the AbstractChildClass class
                // Using the instance of AbstractChildClass we can access methods and data members of AbstractSuperClass class
	
		AbstractSuperClass obj = new AbstractChildOneClass();
		
		System.out.println("I am a data member from Super class and my value is " + obj.a);
		obj.myMethod();
		obj.myMethod(20);
		
	}

	@Override
	void myMethod() {

		System.out.println("I am in child class");
		
	}

Output:
I am a data member from Super class and my value is 10
I am in child class
I am in Super class and I am not an abstract method. I am a concrete method

2. INTERFACE
Basic statement we all know in Selenium is WebDriver driver = new FirefoxDriver();

WebDriver is an interface , FirefoxDriver is a class which is entented from the WebDirver class. 

3. 




*/
		
	}

}
