package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Mean_median_mode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find mean median mode in an array
		Scanner scan = new Scanner(System.in);
	    int n=0,sum=0,mean=0,median=0;
	    int a[]={64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060};
	   n=10;
	    /*
	    System.out.println("Enter size of Array : ");
	    n=scan.nextInt();
		
		for(int i=0;i<n;i++ ){
			a[i]=scan.nextInt();
		}
		
		*/
		for(int i=0;i<n;i++ ){
			sum = sum +a[i];
		}
		mean = sum/n;
		System.out.println("MEAN: "+mean);
		
		median = n/2;
		System.out.println("median value"+median);
		
		if(median == 0)
			System.out.println("MEDIAN:"+a[median]/2);
		else{
			System.out.println(a[median-1] +" "+a[median]);
			System.out.println("MEDIAN::"+(a[median-1]+a[median])/2);
		
		}
		
						
		Arrays.sort(a);
		System.out.println("MODE"+a[0]);
		
	}

}
