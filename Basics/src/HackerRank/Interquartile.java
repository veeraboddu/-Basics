package HackerRank;

import java.util.Arrays;

public class Interquartile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] ={6, 12, 8, 10, 20, 16};
		int tot_a[] = new int[20];
		int b[]={5, 4, 3, 2, 1, 5};
		
		int temp =0,count=0;
		for(int i=0;i<a.length;i++){
			//temp = a[i];
			for(int j=0;j<b[i];j++){
				tot_a[count++] =a[i];
			}
			
		}
		Arrays.sort(tot_a);
		for(int i=0;i<tot_a.length;i++){
			System.out.println(tot_a[i]);
		}
		int start=0,end=0,first_q1=0,first_q2=0;
		first_q1 = quartile(tot_a,start,tot_a.length/2);
		System.out.println(first_q1);
		first_q2 = quartile(tot_a,(tot_a.length/2)+1,tot_a.length-1);
		System.out.println(first_q2);
		
		System.out.println(first_q2 - first_q1);
	}
	
	public static int quartile(int []ab,int start,int end){
		int q = 0,mid1=0,mid2=0;
		//System.out.println(ab.length);
				mid1 =((start+end)/2)-1;
				mid2 = mid1+1;
				//System.out.println(mid1+"  "+mid2);
			//	System.out.println(ab[mid1]+"  "+ab[mid2]);
				q= (ab[mid1]+ ab[mid2])/2;
		return q;
	}

}
