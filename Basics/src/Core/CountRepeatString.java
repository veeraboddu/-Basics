package Core;

import java.util.HashMap;

public class CountRepeatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ar[] = {"murthy","manhar","cris","venkat","devi","ishaan","govind","rakesh","murthy","meghana","meghana","meghana"};
	    HashMap<String, Integer> hm = new HashMap<String, Integer>();
	    int count =0;
	    for(int i=0;i<ar.length;i++){
	    	count =1;
	    	if(hm.containsKey(ar[i])){
	    		System.out.println("hm.get(ar[i]) : "+hm.get(ar[i]));
	    	 count = hm.get(ar[i]) + 1;
	    	}
	    	hm.put(ar[i], count);
	    }
	    System.out.println("Count of Repeat String :"+hm);

	}

}
