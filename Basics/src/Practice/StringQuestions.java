package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringQuestions {
	
	public static void main(String arg[]){
		
		// number of occurrence of each char
		occurrenceOfChar();
		System.out.println("*********************");
		
		// remove all spaces from the given string
		removeSpaces();
		System.out.println("*********************");
		
		// find duplicate characters in string
		duplicateChar();
		System.out.println("*********************");
		
		//split with different specila characters
		spitSpecialChar();
		System.out.println("*********************");
		
		// reverse a string
		reverseString();
		System.out.println("*********************");
		
		//anagram or not 
		anagram();
		System.out.println("*********************");
		
		// string to integer and integer to string
		strIntConvert();
		System.out.println("*********************");
		
		// reverse a string and preserving the position of space
		reversePreservSpace();
		System.out.println("*********************");
		
		// example to show string is immutable are not
		immutableOrnot();
		System.out.println("*********************");
		
		
		// check string rotation on another string
		checkStrRotation();
		System.out.println("*********************");
		
		//Write a java program to reverse each word of a given string?
		reverseEachWord();
		System.out.println("*********************");
		
		// print common characters between two strings or intersection
		// esurance interview question
		commonChars();
		System.out.println("*********************");
		
		
	}
	
	public static void occurrenceOfChar(){
		String occChar ="meghanameghanameghana";
		Map<Character,Integer> map = new HashMap<>();
		int count =0;
		for(int i=0;i<occChar.length();i++){
			 count =1;
			if(map.containsKey(occChar.charAt(i))){
				count = map.get(occChar.charAt(i))+count;
			}
			map.put(occChar.charAt(i), count);
		//	map.remove(key); -- remove the key element
			
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()){
			System.out.println("Key :"+entry.getKey()+" "+"Value: "+entry.getValue());
		}
		
		Set s1= map.entrySet();
		Iterator it = s1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public static void removeSpaces(){
		String i_str = " meghana meghana meghana ";
		System.out.println(i_str);
		System.out.println(i_str.trim());
		String []str_split = i_str.trim().split(" ");
		String without_spaces="";
		for(int i=0;i<str_split.length;i++){
			without_spaces = without_spaces + str_split[i];
		}
		System.out.println(without_spaces);
	}
	
	public static void duplicateChar(){
		String input_str ="meghanaaan";
		Set<Character> dup_char = new HashSet<>();
		Set<Character> non_dup_char = new HashSet<>();
		
		for(int i=0;i<input_str.length();i++){
			if(non_dup_char.contains(input_str.charAt(i))){
				dup_char.add(input_str.charAt(i));
			}else{
				non_dup_char.add(input_str.charAt(i));
			}
		}
		
		for(Character c: dup_char){
			System.out.println("Duplicate Char :"+c);
		}
		for(Character s: non_dup_char){
			System.out.println("Non Duplicate Char :"+s);
		}
	}
	
	public static void spitSpecialChar(){
		String i_str ="hello,meghana!what@are+you?doing#$%";
		String []split_i_str=i_str.trim().split("[ ,!@#$%?+]+");
		for(String s : split_i_str){
			System.out.println(s);
		}
	}
	
	public static void reverseString(){
		String i_str="meghanaboddu meghana murthy sunitha";
		String temp ="";
		for(int i=0;i<i_str.length();i++){
			temp = i_str.charAt(i)+temp;
		}
		System.out.println("Input String : "+i_str);
		System.out.println("Output String:"+temp);
	}
	
	public static void anagram(){
		
		String i_str1 = "meghana";
		String i_str2 = "anahgem";
		char []chary1= i_str1.toCharArray();
		char []chary2= i_str2.toCharArray();
		System.out.println(i_str1);
		System.out.println(i_str2);
		Arrays.sort(chary1);
		Arrays.sort(chary2);
		System.out.println(chary1);
		System.out.println(chary2);
		
		// this function will not work.
		if(chary1.equals(chary2)){
			System.out.println("Given strings are ANAGRAM means characters ar jungle");
		}
		
		// we need to compare array elements by using Arrays object
		if(Arrays.equals(chary1, chary1)){
			System.out.println("Given strings are ANAGRAM ....means characters ar jungle");
		}
			
	}
	
	public static void strIntConvert(){
		
		String i_str ="6";
		int i =6;
		System.out.println(Integer.parseInt(i_str));
		System.out.println(Integer.toString(i));
		System.out.println(Integer.toString(i)+"meghana");
		
	}
	
	public static void reversePreservSpace(){
		String i_str="meghanaboddu meghana murthy sunitha";
		String temp ="";
		for(int i=0;i<i_str.length();i++){
			temp = i_str.charAt(i)+temp;
		}
		System.out.println("Input String : "+i_str);
		System.out.println("Output String:"+temp);
		
	}
		
	public static void immutableOrnot(){
		String st ="meghanaboddu";
	    String st1=st;
	    
	    System.out.println(st == st1);
	    System.out.println("Compare content "+ st.equals(st1));
	    
	}
	
	public static void checkStrRotation(){
		String i_s1 = "JavaJ2eeSeleniumTestNG";
		String o_s2 = "SeleniumTestNGJavaJ2ee";
		
		String i_s2 = i_s1 +i_s1;
		if(! (i_s1.length() == o_s2.length())){
			System.out.println("length not equal");
		} else {
			if (i_s2.contains(o_s2)) {
				System.out.println("Yes String rotation");
			} else {
				System.out.println("No not a String rotation");
			}

		}
	}
	
	public static void reverseEachWord(){
		String i_str ="meghana sunitha murthy";
		String []rev = i_str.split(" ");
		for(int i=0;i<rev.length;i++){
			System.out.print(reverseword(rev[i]) +" ");
		}
	}
	
	public static String reverseword(String str){
		String temp="";
		for(int i=0;i<str.length();i++){
			temp = str.charAt(i)+temp;
		}
		return temp;
	}
	
	public static void commonChars(){
		
		String str1 = "aabbccddaaeeza";
		String str2 = "abbbaacccaaaaa";
		
		List<Character> l1 = new ArrayList<>(); 
		List<Character> l2 = new ArrayList<>();
		
		for(int i=0;i<str1.length();i++){
			l1.add(str1.charAt(i));
		}
		
		for(int i=0;i<str2.length();i++){
			l2.add(str2.charAt(i));
		}
		
		l1.retainAll(l2);
		for(char c:l1){
			System.out.print(c);
		}
	
	}

}

