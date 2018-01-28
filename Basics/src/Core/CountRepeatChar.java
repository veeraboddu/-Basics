package Core;

import java.util.HashMap;

public class CountRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String myfamily = "MurthySunithaMeghana";
	HashMap<Character, Integer> hm= new HashMap<Character,Integer>();
	int count =0;
	for(int i=0;i<myfamily.length();i++){
		count=1;
		if(hm.containsKey(myfamily.charAt(i))){
			count=hm.get(myfamily.charAt(i))+count;
		}
		hm.put(myfamily.charAt(i), count);
	}
	System.out.println(hm);

	}

}
