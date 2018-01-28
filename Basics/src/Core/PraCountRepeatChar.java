package Core;

import java.util.HashMap;

public class PraCountRepeatChar {

	public static void main(String arg[]){
		String countchar ="helloishaanhowareyou";
		HashMap<Character, Integer> hm = new HashMap<>();
		int count =0;
		
		for(int i=0;i<countchar.length();i++){
			count =1;
			if(hm.containsKey(countchar.charAt(i))){
				count = hm.get(countchar.charAt(i))+count;
			}
			hm.put(countchar.charAt(i), count);
		}
		System.out.println(hm);
	}
}
