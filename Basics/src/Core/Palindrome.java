package Core;

public class Palindrome {

	
	
	public static void main(String arg[]){
		
		int n=0;
	    int cheknum = 121;
	    int palendrum = cheknum;
	while(cheknum !=0){
		int i = cheknum %10 ;// 121 = 1, 12 = 2, 1
		n = (n *10) + i ;    //1  // 12 /121
		cheknum = cheknum/10; //121/10 = 12 , 12/10 =1 
	}
		
		if (palendrum == n){
			System.out.println("palindtrom"+n);
		}else{
			System.out.println("Not palindtrom"+n);
		}
		
		StringBuffer st = new StringBuffer("madam");
		 
		StringBuffer st1 = st.reverse();
		if(st.equals(st1)){
			System.out.println("palen");
		}else{
			System.out.println("not Palen");
		}
	}
	
	
	
	
	
}
