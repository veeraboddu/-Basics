package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_1 {
	
	public static void main (String args[]){
		
		System.out.println("************************ ");System.out.println("************************ ");
	/*	  Integer intObj=Integer.valueOf(args[args.length-1]);
	      int i = intObj.intValue();
	      System.out.println(i);
	      if(args.length > 1) 
	         System.out.println(i);
	      if(args.length > 0)
	         System.out.println(i - 1);
	      else 
	         System.out.println(i - 2);
	      */
	      System.out.println("************************ ");
	      System.out.println("************************ ");
	      
		triangle();
		System.out.println("************************ ");
		
		bubbleSort();
		System.out.println("************************ ");
		
		largestInAry();
		System.out.println("************************ ");
		
		palindrome();
		System.out.println("************************ ");
		
		repeatCharCount();
		System.out.println("************************ ");
		
		repeatStringCount();
		System.out.println("************************ ");
		
		swapTwoNumbers();
		System.out.println("************************ ");
		
		fibonacci();
		System.out.println(" ");
		System.out.println("************************ ");
		
		removeduplicates();
		System.out.println("************************ ");
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ ");
		test1();
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ ");
		test2();
		
		 main();
}
	// Print Triangle
	public static void triangle(){
		
		for(int i=0;i<4;i++)
		{
			
			for(int j=4;j>i;j--){
				System.out.print(" ");
			
			}
			for(int k=0;k<i+1;k++){
					System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	// Bubble sort algorithum
	public static void bubbleSort(){
		
		int a[]={90,34,56,76,11,22,44,666,99},temp;
		
		String st="murthy";
		String st1="murthy";
		for(int i=0;i<a.length;i++){
			for (int j=0;j<a.length;j++){
				if(a[i]<a[j]){
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
	}
	
	// 3rd Largest in an array
	public static void largestInAry(){
		int a[]={90,34,56,76,11,22,44,666,99},temp;
		
		Arrays.sort(a);
		System.out.println(a[a.length-3]);
		if(true){
			
		}else if(false){
			
		}
	}
	
	// Palindrome
	public static void palindrome(){
		
		String st = "madam",rev="";
		
		for(int i=0;i<st.length();i++){
			rev = st.charAt(i)+rev;
		}
		System.out.println(rev);
		
		if(st.equals(rev))
			System.out.println("Given string is palindrome");
		else
			System.out.println("Not a palindrome");
		
	}
	
	// repeat character count for given string
	public static void repeatCharCount(){
		String repeat ="murthysunithamegha";
		HashMap<Character, Integer> hm = new HashMap<>();
		int count=0;
		for(int i=0;i<repeat.length();i++){
			count=1;
			if(hm.containsKey(repeat.charAt(i))){
				count = hm.get(repeat.charAt(i))+count;
			}
			hm.put(repeat.charAt(i), count);
		}
		System.out.println("Character count for the given String********");
		System.out.println(hm);
		Set<Character> s1 = hm.keySet();
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
	
	// repeat string count for given word 
	public static void repeatStringCount(){
				
		String repeatStr = "murthy meghana sunitha sunitha meghana";
		String strary[] = repeatStr.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		int count =0;
	    for(int i=0;i<strary.length;i++){
	    	count=1;
	    	//System.out.println(strary[i]);
	    	if(hm.containsKey(strary[i])){
	    		count = hm.get(strary[i])+count;
	    	}
	    	hm.put(strary[i], count);
	    }
	    
	    System.out.println(hm);
	}
	
	// swap number without using third variable
	
	public static void swapTwoNumbers(){
		int a=500,b=1000;
	    System.out.println("A ="+a+" B= "+b);
	    a= a+b;
	    b= a-b;
	    a= a-b;
	    System.out.println("A ="+a+" B= "+b);
		
	}
	
	//Fibbonacci series  1 1 2 3 5 8 13 21 34 55
	public static void fibonacci(){
		
		int n =8,fib1=1,fib2=1,fib3;
		System.out.print(fib1+" "+fib2);
		for(int i=0;i<n;i++){
			fib3= fib1+fib2;
			System.out.print(" "+fib3);
			fib1=fib2;
			fib2=fib3;
		}
	}
	
	public static void removeduplicates(){
		/*
		String []gvnStr ={"java","db2","struts","ObjectiveC","C","java","db2","struts","selenium","jayway","jayway","java"};
		Set nonduplicate_hs = new HashSet<>();
		Set duplicate_hs = new HashSet<>();
		
		for(String str : gvnStr){
			
			if(!nonduplicate_hs.contains(str))
				nonduplicate_hs.add(str);
			else
				duplicate_hs.add(str);
			
		}
		System.out.println(nonduplicate_hs);
		System.out.println(duplicate_hs); */
	final List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);

		list.remove(1);
		System.out.println(list);
		for(int i = 0; true; i++) {
            System.out.println("Hello");
            break;
        }
	}
	
	public static void test1(){

	
	
	}
public static void test2(){
	System.out.println("test2");
	}
static {
	System.out.println("test112");
	}
	//end

public static void main(){
	System.out.println("Main");
}
}