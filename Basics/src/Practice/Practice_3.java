package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Practice_3 {
	
	public static void main(String arg[]){
		
		//Program Desc
		// method declaration 
		System.out.println("arg length "+arg.length);
		//•	Write a function that returns a boolean indicating whether a string is a palindrome
		palindrome();
		
		//•	Write a program for binary representation of a number
		decimalToBinary();
		
		// •	Write function that finds the n largest integers in an array and returns them in a new array.
		// intArryReadAndWrite();
		
		// •	Write a program to find out unique elements from string and how to remove duplicate elements
		   uniqueElementsRemoveDuplicates();
		   
		//•	Write a Java Code to find the Nth largest number in an array
		   nthLargestElement();
		   
		//•	Write a Java code to flip the coin, for every two minutes interval
		   randomNumberGeneration();
		   
		//•	Fibonacci Series
		   fibbonacciSeries();
		   
		//   •	Write a code to find the Prime Numbers
		   primeNumberOrNot();
		   
		//•	Write a code to find the Even Numbers   
		   evenOrOddNumber();
		   
		//•	write a code to separate the number from strings.
		   separateNumbersFromString();
		   
		//•	Two lists, 1,2,3 and 1,2,3,4,5, write a program to find the difference in these two lists. 
		   compareTwolists();
		   
		//•	Series of numbers and to write a program to arrange it in an array in square matrix   
		 //  matrix2_2();
		   matrix4_4();
		   
		//•	Fizz-Buzz Programming  
		   fizzbuss();
		   
		// type case float to double
		   typeCast();
		   
		//•	Series of numbers and to write a program to arrange it in an array in square matrix
		//   sqareMatrix();
		   
		//•	there is an array {2,4,6,8,3}. Take out one element and add others, take out 2nd one and add others... so we need to find the largest sum of remaining numbers.   
		   listSum();
		   
		// Binary sort 
		   insertionSort();
		   
		// linked list reverse traversal
		   linkedListReverseOrder();
		   
		   list_add_remove_sum();
		   
		// How to sort hashmap
		   sortHashmap();
		   
		// Remove duplicate word
		   removeDuplicatword();
		   commonChars();
	}
	
	public static void palindrome(){
		
		String st = "madam",rev="";
		
		for(int i=0;i<st.length();i++){
			rev = st.charAt(i)+rev;
		}
		System.out.println(rev);
		
		if(st.equals(rev)){
			System.out.println("Given string is Palindrome");
		}else{
			System.out.println("Given string is Not Palindrome");
		}
		
	}
	
	public static void decimalToBinary(){
		
		int decimalNumber = 10;
		int decBinary[] = new int[20];
		
		System.out.println("Decimal to Binary of given number 10 is By using Integer Object "+Integer.toBinaryString(10));
		int count=0;
		while(decimalNumber > 0){
			decBinary[count++] = decimalNumber%2;
			decimalNumber = decimalNumber/2;
			
		}
		System.out.println("Decimal to Binary ");
		for(int i=0;i<=count;i++){
			System.out.print(decBinary[i]);
		}
	}
	
	public static void intArryReadAndWrite(){
		
		System.out.println("\nEnter the int arry size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		int arr[] = new int[n];
		
		for(int i =0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		for(int i =0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void uniqueElementsRemoveDuplicates(){
	
	String givenstr = "geeksforgeeks";
	Set<Character> unique = new HashSet<>();
	Set<Character> duplicate = new HashSet<>();
	
	for(int i=0;i<givenstr.length();i++){
		
		if(unique.contains(givenstr.charAt(i)))
			duplicate.add(givenstr.charAt(i));
		else
			unique.add(givenstr.charAt(i));
	}
	System.out.println("Given String: "+givenstr);
	System.out.println("\n\n  Unique: "+unique);
	System.out.println("Duplicate : "+duplicate);
	}
	
	public static void nthLargestElement(){
		
		int arr[] = {1,3,5,2,8,4,77,11,9,10};
		
		// Second largest
		int n =3,temp;
		
		// By using arry of sort method
		Arrays.sort(arr);
		
		// bublle sort
		/*for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		for(int i=1;i<arr.length;i++){
			for(int j=1;j<arr.length-i;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(arr[arr.length - n]);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void randomNumberGeneration(){
		
		Random r =new Random();
		System.out.println("Random numbers below 10");
		for(int i=0;i<5;i++)
			System.out.println(r.nextInt(10));
	}
	
	public static void fibbonacciSeries(){
		int fib1=0,fib2=1,n=10,nexFib=0;
		System.out.print("Fibbonacci Series "+fib1+" "+fib2);
		for(int i=0;i<10;i++){
			nexFib = fib1+fib2;
			System.out.print(" "+nexFib);
			fib1=fib2;
			fib2=nexFib;
		}
	}
	
	public static void primeNumberOrNot(){
		
		// find first 100 prime numbers
	
		System.out.println("\nPrime numbers below 10" );
		for (int i=1;i<10;i++){
			int count=0;
			for(int num=i;num>=1;num--){
				if(i%num == 0){
					count = count +1;
				}
			}
			if(count ==2){
				System.out.println(" "+i );
				}
		}
		
	}
	
	public static void evenOrOddNumber(){
		
		int x =5;
		 if ( x % 2 == 0 )
	         System.out.println("You entered an even number.");
	      else
	         System.out.println("You entered an odd number.");
	}
	
	public static void separateNumbersFromString(){
		
		String givenStr = "meghana01072014sunitha200719921404murthy";
	    String numbers="";
		String chars="";
		
		for(int i=0;i<givenStr.length();i++){
			char c =givenStr.charAt(i);
			if(Character.isDigit(c)){
				numbers = numbers+c;
			}else
				chars = chars + c;
		}
		System.out.println("Numbers : "+numbers);
		System.out.println("Chars : "+chars);
	}
	
    public static void compareTwolists(){
    	
    	List<String> l1 = new ArrayList<>();
    	l1.add("1");
    	l1.add("2");
    	l1.add("3");
    	
    	List<String> l2 = new ArrayList<>();
    	l2.add("1");
    	l2.add("2");
    	l2.add("3");
    	l2.add("4");
    	l2.add("5");
    	l2.remove(4);
    	
    	l2.removeAll(l1);
    	System.out.println(l2);
    	
    }
	
    public static void fizzbuss(){
    	
    	int givenNumber = 45;
    	boolean flag =true;
    	if(givenNumber % 5 == 0 && givenNumber % 3 == 0){
    		System.out.println("fizzbuzz");
    		flag=false;
    	}else if(givenNumber % 5 == 0){
    		System.out.println("buzz");
    		flag=false;
    	}else if(givenNumber % 3 == 0){
    		System.out.println("fizz");
    		flag=false;
    	}
    	
    	if(flag){
    		System.out.println("Number is not divided by 3 or 5 givenNumber is: "+givenNumber);
    	}
    }
    
    public static void  typeCast(){
    	
    	float f1 = 23.22323f;
    	double d1 ;
    	d1 = (float)f1;
    	System.out.println("Float Value:"+f1+"  "+"Double value:"+d1);
    	
    	double d2 = 32.2323234d;
    	float f2;
    	f2 = (float)d2;
    	System.out.println("Float Value:"+f2+"  "+"Double value:"+d2);
    }
    
    public static void sqareMatrix(){
    	int n=3,m=3;
    	int a[][]=new int[4][4];
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter"+n+" "+m+ "Matrix");
    	for(int i=0;i<=n;i++){
    		for (int j=0;j<=m;j++){
    			a[i][j]=sc.nextInt();
    		}
    	}	
    		for(int i=0;i<=n;i++){
        		for (int j=0;j<=m;j++){
        			if(a[i][j]==1){
        			 for(int i1=0;i1<=n;i1++){
        				 if(i!=i1)
        					 a[i][i1]=1;
        			 }
        			 for(int j1=0;j1<=m;j1++){
        				 if(j!=j1)
        					 a[j1][j]=1;
        			 }
        				
        			}
        			
        		}
    	}
    		
    		for(int i=0;i<=n;i++){
        		for (int j=0;j<=m;j++){
        			System.out.println(a[i][j]);
        		}
        	}
    }
    
    public static void listSum(){
    	
    	List<Integer> l1 = new ArrayList<>();
    	l1.add(2);
    	l1.add(4);
    	l1.add(6);
    	l1.add(8);
    	l1.add(3);
    	l1.remove(0);
    	int sum=0,sum1=0;
    	for(int i= 0;i<l1.size();i++){
    		sum = sum + l1.get(i);
    	}
    	System.out.println(l1);
    	System.out.println("Sum : "+ sum);
    	
    	l1.remove(0);
    	
    	for(int i= 0;i<l1.size();i++){
    		sum1 = sum1 + l1.get(i);
    	}
    	System.out.println(l1);
    	System.out.println("Sum1 : "+ sum1);
    	
    	if(sum > sum1)
    		System.out.println("First sum is largest :"+sum);
    	else
    		System.out.println("Second sum is largest :"+sum1);
    	
    }
    public static void insertionSort(){
    	
    	int a[] = {10,5,3,7,2};
    	int j;
    	for(int i=1;i<a.length;i++){
    		int key = a[i];
    		j=i-1;
    		while(j>=0&& a[j]>key){
    			a[j+1]=a[j];
    			j--;
    		}
    		a[j+1]=key;
    	}
    }
    
    public static void linkedListReverseOrder(){
    	
    	LinkedList<String> l1 = new LinkedList<>();
    	l1.add("zzmeghana");
    	l1.add("xxmeghana");
    	l1.add("aaameghana");
    	l1.add("bsunitha");
    	l1.add("cmurthy");
    	
    	Collections.reverse(l1);
    	System.out.println(l1);
    	
    	Collections.sort(l1);
    	
    	for(int i=0;i<l1.size();i++){
    		System.out.println(l1.get(i));
    	}
    }
    
    public static void  matrix4_4(){
    	
    	int a[][] = new int[4][4];
    	
    	System.out.println("4 * 4 matrix Value ::::::::");
    	for(int i=0;i<4;i++){
    		for(int j=0;j<4;j++){
    			
    			if (i==0 | j ==0 | i == 3 | j== 3){
    				a[i][j]=1;
    			}	
    			else 
    				a[i][j]=0;
    					
    			}
    		}
    	for(int i=0;i<4;i++){
    		System.out.println(" ");
    		for(int j=0;j<4;j++){
    			System.out.print(a[i][j]);
    		}
    	}
    	System.out.println(" ");
    }
    
    public static void list_add_remove_sum(){
    	
    	List<Integer> l1 = new ArrayList<>();
    	l1.add(10);
    	l1.add(20);
    	l1.add(30);
    	l1.add(40);
    	l1.add(50);
    	
    	Collections.sort(l1);
        
    	l1.remove(0);
    	l1.add(60);
    	int sum=0,sum1=0;
    	for(int i=0;i<l1.size();i++){
    		sum = sum +l1.get(i);
    	}
    	
    	l1.remove(0);
    	l1.add(100);
    	
    	for(int i=0;i<l1.size();i++){
    		sum1 = sum1 +l1.get(i);
    	}
    	
    	System.out.println(" Sum: "+sum+ "  Sum1: "+sum1);
    }
    
     public static void sortHashmap(){
    	 
    	 HashMap<Integer,String> hm = new HashMap<>();
    	 hm.put(4, "adMeghana");
    	 hm.put(3, "aaeMeghana");
    	 hm.put(10, "bbaMeghana");
    	 hm.put(20, "ccbMeghana");
    	 hm.put(5, "ccscMeghana");
    	 
    	 System.out.println("\nUnsorted map \n"+hm);
    	 
    	 TreeMap<Integer,String> sortedmap = new TreeMap<>(hm);
    	 System.out.println("\n Sorted map \n"+sortedmap);
    	 
    	 /*
    	 List<Entry<Integer,String>> list = new LinkedList<Entry<Integer,String>>(hm.entrySet());
    	 
    	 Collections.sort(list, new Comparator<Entry<Integer,String>>(){
    		 public int compare(Entry<Integer,String> o1,Entry<Integer,String> o2){
    			 return o1.getValue().compareTo(o2.getValue());
    		 }
    	 });
    	 
    	 for(Entry<Integer,String> item:list){
    		 System.out.println(item);
    	 }
    	 */
     }
     
     public static void removeDuplicatword(){
    	 String str = "Goodbye bye bye world world world";
    	 String str111="Murthymeghana";
    	 char ch[]=str111.toCharArray();
    	 System.out.println(ch.length);
    	 String ag[] = str.split(" ");
    	 Set<String> s1 = new HashSet<>();
    	 String result ="";
    	 for(int i=0;i<ag.length;i++){
    		 if(!(s1.contains(ag[i]))){
    			 s1.add(ag[i]);
    			 result = ag[i] + " "+result ;
    		 }
    	 }
    	 
    	/* Iterator<String> it = s1.iterator();
    	 while(it.hasNext()){
    	    	System.out.print(it.next()+ " ");
    	 }*/
    	 for(String s:s1){
    		 System.out.print(s+ " ");
    	 }
    	 System.out.println("");
    	System.out.println(result);
     }
     
     public static void commonChars(){
    	 
    	 String in1= "aabbccddaaeeza";
    	 String in2= "abbbaacccaaaaa";
    	 List<Character> l1= new ArrayList<>();
    	 List<Character> l2= new ArrayList<>();
    	// List<Character> l3= new ArrayList<>();
    	 for (int i=0;i<in1.length();i++){
    		 l1.add(in1.charAt(i));
    	 }
    	 for (int i=0;i<in2.length();i++){
    		 l2.add(in2.charAt(i));
    	 }
    	boolean l3= l1.retainAll(l2);
    	 System.out.println("L1 Elements and L3 Value :"+l3);
    	 for (int i=0;i<l1.size();i++){
    		 System.out.println("Values - "+l1.get(i));
    	 }
    	 System.out.println("L2 Elements ");
    	 for (int i=0;i<l2.size();i++){
    		 System.out.println("Values - "+l2.get(i));
    	 }
    	 

     }
}
