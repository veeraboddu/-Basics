package NaveenIntQA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplElementArray {
	
	public static void main(String arg[]){
		String a[] ={"VC++","C++","C","JAVA","","VC++","ObjC","JAVA","C"};
		
		// 1st solution
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i].equals(a[j])){
					System.out.println("Duplicate Value ::" +a[i]);
				}
			}
		}
		
		// 2nd solution
		
		Set<String> store = new HashSet<>();
		
		for(int i=0;i<a.length;i++){
			if (store.add(a[i]) == false){
				System.out.println("Duplicate value"+a[i]);
			}
		}
		
		// 3rd solution
		
		Map<String,Integer> storemap= new HashMap<>();
		int count=0;
		for(int i=0;i<a.length;i++){
			count=1;
			if(storemap.containsKey(a[i])){
				count = storemap.get(a[i])+count;
			}
			storemap.put(a[i], count);
		}
		System.out.println(storemap);
		
		for(Map.Entry<String, Integer> entry : storemap.entrySet()){
			entry.getKey();
			entry.getValue();
		}
	}

}
