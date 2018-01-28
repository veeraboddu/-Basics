package Practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Hackerrank_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
Sample Input

hello
java

Sample Output

9
No
Hello Java

		 * 
		 */
		program1();
		program2();
		program3();
		program4();
		program5();
		program6();
		program7();
		

	}
	
	public static void program1(){
		
		Scanner scan =new Scanner(System.in);
		String A = "abcde";//scan.next();
		String B = "abcd";//scan.next();
		
		System.out.println(A.length()+B.length());
		System.out.println(A.compareTo(B)>0?"Yes":"No");
		System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));
			
		}
	
	public static void program2(){
		// input helloworld - sub string 3 to 7
		String str = "helloworld";
		System.out.println(str.substring(3, 7));
	}
	
	public static void program3(){
	/*	input
		welcometojava
		3

		Output 0
		ava
		wel     */
		
		String str ="welcometojava";
		int k = 5;
		SortedSet<String> sets=new TreeSet<String>();
	    for(int i=0;i<=str.length()-k;i++){
	        sets.add(str.substring(i,i+k));
	    }
	    System.out.println(sets);
	    System.out.println(sets.first());
	    System.out.println(sets.last());

	}
	
	public static void program4(){
		 Scanner sc=new Scanner(System.in);
	        String A="madam";//sc.next();
	        String rev="";
	        /* Enter your code here. Print output to STDOUT. */
	        for(int i=0;i<A.length();i++){
	            rev = A.charAt(i)+rev;
	        }
	        System.out.println(rev);
	        if(A.equals(rev)){
	            System.out.println("Yes");}
	        else{
	            System.out.println("No");}
	            
	}
	
	public static void program5(){
		// Anagram example : CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
		
		String s ="anagram";
		String s1 = "margana";
		s= s.toLowerCase();
		s1= s1.toLowerCase();
		char ar[]=s.toCharArray();
		char ar1[]=s1.toCharArray();
		Arrays.sort(ar);
		System.out.println(ar);
		Arrays.sort(ar1);
		System.out.println(ar1);
		
		if(Arrays.equals(ar, ar1))
		{
			System.out.println("Anagrams");
		}else{
			System.out.println("Not Anagrams");
		}
	}
	
	public static void program6(){
		//He is a very very good boy, isn't he?
		
		String str = "He is a very very good boy, isn't he?";
		String deli = "[ ,'?]";
		/*		str =str.replace("?", "");
		str =str.replace("'", "");
		str =str.replace("?", "");*/
	//	String [] token = str.trim().split("[ !,?.\\_'@]+");
		String [] token = str.trim().split("[ ,?']+");
		for(String s: token){
			   System.out.println(s);
		}
	}
	
	public static void program7(){
		
		//([A-Z])(.+)    		[AZ[a-z](a-z)    		 batcatpat(nat
		
		 String pattern = "[AZ[a-z](a-z)";
         try {
             //Pattern.compile(pattern);
        	 Pattern.compile(pattern);
             System.out.println("Valid");
         } catch (PatternSyntaxException e) {
             System.out.println("Invalid");
         }
	}
	}
