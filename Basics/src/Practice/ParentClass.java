package Practice;

public class ParentClass {
	 private ParentClass() {
	        
	    }

	    public static void parentMethod() {
	        System.out.println("In Parent Class method...");
	    }
	}

// ParentClass is a private constructor so we can not extent the parentclass
// throws compile time excetion. 
// Implicit super constructor ParentClass() is not visible for default constructor. Must define an explicit constructor
	//class ChildClass extends ParentClass {
	    
		class ChildClass  {
			
	    public static void childMethod() {
	        System.out.println("In Child Class method...");
	    }
	    
	        public static void main (String[] args) throws java.lang.Exception
	    {
	        
	            ChildClass.childMethod();
	            ParentClass.parentMethod();
	        
	    }
}
