package Practice;
/*count the total number of times each alphabet appears in the string 
 * Author : Veera Boddu
 * Date : 8/15/2017
 * */

import java.util.HashMap;

public class Charcount {
	
	public static void main(String arg[]){
		
		eachCharCount();
	}
	
	public static void eachCharCount(){
		// Given string hardcoded
		String givenstring ="life is good all the time";
		// Declared Hashmap object contain both key and value path
		HashMap<Character, Integer> hm = new HashMap<>();
		int count=0;
		// iterating the loop
		for(int i=0;i<givenstring.length();i++){
			count=1;
			// checking if given char in hashmap object if exist increasing the count
			// else added to hashmap
			if(hm.containsKey(givenstring.charAt(i))){
				count = hm.get(givenstring.charAt(i))+count;
			}
			hm.put(givenstring.charAt(i), count);
		}
		System.out.println("Character count for the given String : "+ givenstring);
		// Print the Hashmap object
		System.out.println(hm);
	}

	}
