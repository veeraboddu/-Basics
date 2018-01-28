package Core;

public class FirstLatOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]={1,3, 4, 5,6,4,6,7,8,9,6,4,6,2,6};
		
		System.out.println("Find the first and last occurance of 6 : ");
		int first=0,last=0;
		for(int i=0;i<ar.length;i++){
			if(ar[i]== 6 && first == 0 && last==0){
				first = i+1;
				last = i+1;
			}
			if(ar[i]==6 && last>0){
				last = i+1;
			}
		}
		
		System.out.println("First Occurance 6 :"+first +" Last Occureance 6 :"+last);
 
	}

}
