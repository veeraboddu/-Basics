package QnA;

import java.util.Map;

public class CollectionQnA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Collections Question and Answers
		collQnA();

	}
	
	public static void collQnA(){
		
		/*
		 
		 - Collection interface is the root interface of Collection hierarchy
		 - Collection interface extends Iterable interface but Iterable interface
		   presnet in java.lang package not in java.util package.
		 - Collection is an interface
		 - Collections is a java class both are java collections framework
		 - stack, properties, vector and Hashtable are synchronized and thread environment.
		 - Collection interfaces - Collection, set, map, list,Queue
		                         - Sortedset, SortedMap, Deque, ListIterator.
		 - Difference set n List
		   - Set contain unique element, list contain duplicate elements
		   - set is unordered element, list is order in which the objects are added.
		   - Map n set - map contain unique keys and set is unique values 
		   - List classes - Arraylist, Vector, LinkedList
		   - Set Classes - HashSet, LinkedHashSet, TreeSet.
		   
		- Iterator - is used to iterate the elements
		- reverse list - Collectins.reverse()
		- convert array of string into list
		  String []aryStr = {"meghana","sunitha","murthy"};
		  List listobj = Arrays.asList(aryStr);
		  
		- ArrayList v Vector
		 - Both are implemented from List ordered arranged
		 - ArrayList is used for fast iteration, Vector is slow
		 - Vector is synchronized and arraylist is not
		 - Vector increases the capacity twice of its size where as Arraylist 50% of size
		 
		 - Iterator and ListIterator
		   Iterator we can traverse list of elements in forward directions
		   ListIterator we can traverse list of elements in both forward and backward direction.
		   
	     - Ascending order
	       HashTable < Collections.SynchronizedMap < ConcurrentHashMap < HashMap
	       
	       - LinkedList - decendingIterator() is user to traversal in reverse direction. 
	       
	     - When to use ArrayList() and when to use LinkedList()
	       ArrayList constant time search operation - like get() n search operation
	       LinkedList - insert and delete operation are more. 
	       
	     - Iterator<String> it = l1.iterator();
	       while(it.hasNext){
	        sop((it.next);
	       }
		  for(String s : it){ sop (s);}
		  For(Map.Entry<String,String> entry: mapObj.entryset()){
		   sop(entry.getKey(), entry.getvalue);
		  }
		 
		 - how to make collection read only
		  Collections.unmodifiableMap(Map m);
		  Collections.unmodifiableSet(Set s);
		  Collections.unmodifiableList(List l);
		 
		 -
		 static variables or methods can access by class name.
		 Where as non static variable or methods can access by object.
		 
		 
		 Non static variable does not work in static method (or)
		 In side static method, we can not access non static variable
		 // compiler error
		 ex1:
		 class Test{
		 int i=0;
		 public static void main(String arg[]){
		 sop(i);
		 }
		 
		 Static variable in side not static method can access.
		 ex2:

		 class Test{
		 int i =0
		 static int j =10;
		 
		 public void method1(){
		    sop(j);
		 }   
		 
		 ex3:
		 class A{
		 int num1 =1
		 static int num2=2;
		 //  static void can accesable in non static method.
		 public void show(){
		  num2 =5;
		 }
		 
		 publc class Demo{
		 public static void main(Strin arg[]){
		 A.num2 =20;
		 // non static variable can not be accessable in static method 
		 A obj1 = new A();
		 obj1.num1 =12;
		 
		 }
		 
		 }

     Set s1 = 
//  for(String s:s1){
    		 System.out.print(s+ " ");
    	 }
    	 
for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		 */
		
	}

}
