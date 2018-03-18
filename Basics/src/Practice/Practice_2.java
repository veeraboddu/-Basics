package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Practice_2 {

	public static void main(String arg[]){
		
		System.out.println("Missing number from the given sequence");
		missingNumber();
		System.out.println("-------------------------------------");
		
		System.out.println("Print 1 to 10 with out loop (recursion) ");
		int i=1; 
		withoutLoop(i);
		System.out.println("-------------------------------------");
		
		
		System.out.println("Compare two arraylists ");
		compareTwoarrays();
		System.out.println("-------------------------------------");
		
		System.out.println("Anagram  ");
		anagram();
		System.out.println("-------------------------------------");
		
		
		System.out.println("DecimalToBinary ");
		decimalToBinary();
		System.out.println("-------------------------------------");
		
		System.out.println("Check given string contains digit or characters ");
		containsOnlyNumbers("123abc");
		System.out.println("-------------------------------------");
		
		
		System.out.println("Find number of vowels ");
		findNumberOfVowels("123abc");
		System.out.println("-------------------------------------");
		
		
		convertStringToInt();
		
		removeDuplicates();
		
		// linked list iterate the elements in reverse order
		MyReverseIter(); 
		
		// given word contain in another string or not
		ContainOrNot();
		
		// string sorting array
		sortStirngs();
		
		// first repeated char in the given string 
		repearCharGivenString();
		
		commonValues();
		
		CheckSum();
	}
	
	public static void missingNumber(){
		
		int arr[] = {1,2,3,4,6};
		
		int sum=0,formula = arr.length+1;
		for(int i=0;i<arr.length;i++){
			sum = sum+arr[i];
		}
		
		formula =  formula*(formula+1)/2;
		System.out.println("Mission number:"+ (formula-sum));
		
	}
	
	public static void withoutLoop(int i){
		
		System.out.print(" "+i);
		if(i<10){
			withoutLoop(i+1);
		}	
	}
	
	public static void compareTwoarrays(){
		
		List l1 = new ArrayList<String>();
		
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("4");
		l1.add("Firstset");
		
		List l2 = new ArrayList<String>();
		l2.add("1");
		l2.add("2");
		l2.add("3");
		l2.add("4");
		l2.add("Firstset");
		
		if(l1!=null && l2!=null && l1.size() == l2.size()){
			System.out.println("l1 and l2 equal size");
			boolean bolvalu = l1.equals(l2);
			System.out.println("l1 and l2 equal or not (true /False): "+bolvalu);
			
		}
	}
	
	public static void anagram(){
		
		String st ="manhar";
		String st1 = "rahman";
		
		char []char_st = st.toCharArray();
		char []char_st1=st.toCharArray();
		
		Arrays.sort(char_st);
		System.out.println(char_st);
		Arrays.sort(char_st1);
		System.out.println(char_st1);
		
		
		boolean value = char_st.equals(char_st1);
		System.out.println("Given String is anagram or not : "+value);
		
		System.out.println("Given String is anagram or not : "+Arrays.equals(char_st, char_st1));
		
	}
	
	public static void decimalToBinary(){
		
		int givenNumber = 10;
		int []binary = new int[20];
		
		for(int i=0; givenNumber > 0; i++){
			
			binary[i]= givenNumber%2;
			givenNumber = givenNumber/2;
			System.out.print(binary[i]);
		}
	}
	
	public static void containsOnlyNumbers(String s){
		
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				//return true;
				System.out.println("Given char ---"+s.charAt(i) +" ---is a digit");
			}else{
				System.out.println("Given char ---"+s.charAt(i) +" --- is not a digit");
			}
		}
	}
	
	public static void findNumberOfVowels(String s){
		
		char Chars[] =s.toCharArray();
		int count =0;
		for(char c:Chars){
			
			switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		System.out.println("Number of vowels in the given String "+s+" is "+count);
	}
	
	public static void convertStringToInt(){
		
		String st ="123";
		int intValue = 321;
		
		System.out.println(Integer.valueOf(st));
		System.out.println(Integer.toString(intValue));
	}
	
	public static void removeDuplicates(){
		
		String dupstr ="abcabc";
		HashSet<Character> s1 = new HashSet<>();
		
		for(int i=0;i<dupstr.length();i++){
			s1.add(dupstr.charAt(i));
		}
		
		System.out.println("Given String : \n"+dupstr+ "\nAfter remove duplicate characters :");
		for(Character ch:s1)
		System.out.print(ch);
		
	}
	
	public static void MyReverseIter(){
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Murthy");
		ll.add("Sunitha");
		ll.add("meghana");
		
		System.out.println("\n Linked list elements :"+ll);
		
		Iterator<String> it =ll.descendingIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	private static Iterator<String> Iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void ContainOrNot(){
		
		String input = "Android gave new life to Java"; 
		
		System.out.println(input.contains("Java"));
		input = input.replace("Java", "");
		System.out.println("final string:: "+input);
	}
	
	public static void sortStirngs(){
		
		String ary[] ={"veera","sunitha","meghana"};
		Arrays.sort(ary);
		for(String str : ary){
			System.out.println(str);
		}
	}
	
	public static void repearCharGivenString(){
		
		String str= "ishaana";
		
		Set<Character> s1 = new HashSet<>();
		for(int i=0;i<str.length();i++){
			
			if(s1.contains(str.charAt(i)) ){
				System.out.println("First repeated char is: "+str.charAt(i));
			}else{
				s1.add(str.charAt(i));
			}
		}
		
		
	}
	
	public static void commonValues(){
		
	 String str1 = "aabbccddaaeeza"; // a=5 b =2 c =2 d=2 e=2 z-1
	 String str2 = "abbbaacccaaaaa";
	 char[]ch = str1.toCharArray();
	 char[]ch2 = str2.toCharArray();
	 
	 // Output str3 = "aaaaabbcc"
	 List<Character> l1 = new ArrayList<>();
	 List<Character> l2 = new ArrayList<>();
	 
	 for(int i=0;i<ch.length;i++){
		 l1.add(ch[i]);
	 }
	 
	 for(int i=0;i<ch2.length;i++){
		 l2.add(ch2[i]);
	 }
	// List<String> l3 = new ArrayList<>();
	 /*
	 l1.add("a");
	 l1.add("a");
	 l1.add("b");
	 l1.add("b");
	 l1.add("c");
	 l1.add("c");
	 l1.add("d");
	 l1.add("d");
	 l1.add("a");
	 l1.add("a");
	 l1.add("e");
	 l1.add("e");
	 l1.add("z");
	 l1.add("a");
	 
	 
	 l2.add("a");
	 l2.add("b");
	 l2.add("b");
	 l2.add("b");
	 l2.add("a");
	 l2.add("a");
	 l2.add("c");
	 l2.add("c");
	 l2.add("c");
	 
	 l2.add("a");
	 l2.add("a");
	 l2.add("a");
	 l2.add("a");
	 l2.add("a");  */
	 
	 //l1.addAll(l2);
	 
	 l1.retainAll(l2);
	 for(int i=0;i<l1.size();i++){
		 System.out.print(" "+l1.get(i));
	 }
	}
	
	public static void CheckSum(){
		
		int[] nums = {2, 7, 11, 2};
		int target = 9;
		
		System.out.println(" Check the sum ");
		for(int i=0;i<=nums.length;i++){
			for(int j=i+1;j<=nums.length-1;j++){
				if(nums[i]+nums[j] == target){
					System.out.println(nums[i]+" "+nums[j]);
				}
			}
		}
		
	}
}
