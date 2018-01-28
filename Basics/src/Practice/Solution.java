package Practice;

import java.util.Arrays;

public class Solution {
	
	public static void main (String arg[]){
	
	String str1 = "We test coders. Give us a try?"; // should return 4
	//solution(str1);
	System.out.println("MAX:::"+solution(str1));
	}
	public static int solution(String totstr){
		System.out.println(totstr);
		String[] ary1= totstr.split("\\.");
		int a[]={0,0},max=0;String[] wordcount=null;
	/*	System.out.println(ary1.length);
		for(int i=0;i<ary1.length;i++){
			System.out.println(ary1[i]);
		}*/
		
		for(int i=0;i<ary1.length-1;i++){
			wordcount=ary1[i].split(" ");
				a[i]= wordcount.length +1;
				System.out.println(a.length);
			 Arrays.sort(a);
			 max= a[a.length-1];
		}
		
		//System.out.println(ary1.length);
		//System.out.println(ary1[1]);
		//String[] ary2= S.split("?");
	//	String[] ary3= S.split("!");
		
		
		return max;
	}

}
