

//@ Authot : Murthy
// object sorting my using Comparable interface
package ObjSort;

import java.util.ArrayList;
import java.util.Collections;

class ObjectSort {

	public static void main(String arg[]){
		
		ArrayList<SortFruitObject> l1= new ArrayList<SortFruitObject>();
		
		l1.add(new SortFruitObject("Apple","GalaApple", 10));
		l1.add(new SortFruitObject("Mango","Mango Desc", 20));
		l1.add(new SortFruitObject("PinneApple","PineApple", 30));
		l1.add(new SortFruitObject("Grape","Grape desc", 1));
		l1.add(new SortFruitObject("Oragne","Orange Desc", 100));
		
		Collections.sort(l1);
		
		 for(SortFruitObject str: l1){
				System.out.println(str.fruitName);
		   }
	}
	
}	
	 class SortFruitObject implements Comparable<SortFruitObject>{
		
		String fruitName;
		String fruitDec;
		int quantity;
		
		
		 SortFruitObject(String fruitName, String fruitDec, int quantity) {
			super();
			this.fruitName = fruitName;
			this.fruitDec = fruitDec;
			this.quantity = quantity;
		}
		
		public String getFruitName() {
			return fruitName;
		}
		public void setFruitName(String fruitName) {
			this.fruitName = fruitName;
		}
		public String getFruitDec() {
			return fruitDec;
		}
		public void setFruitDec(String fruitDec) {
			this.fruitDec = fruitDec;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;	
		}

		@Override
		public int compareTo(SortFruitObject os) {
			
			// compare int values
			// Ascending order min to max
			//return this.quantity- os.getQuantity();
			
			// Decending order max to min
			//return os.getQuantity() - this.quantity;
			
			// compare String values  Ascending order
			//return this.fruitName.compareTo(os.getFruitName());
			
			// compare String values  Decending order
			return os.getFruitName().compareTo(this.fruitName);
			
			
			// compare String values
		    //return this.fruitDec.compareTo(os.getFruitDec());
		}
	}



