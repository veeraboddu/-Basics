package QnA;

public class OopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		   An abstract class can have a constructor(s), but the constructor(s) must be implemented. An Interface must not have a constructor at all.
		  
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
When an object is transferred through the network, the object needs to be 'serialized'. Serialization converts the object state to serial bytes.

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

		 */
		
	}

}
