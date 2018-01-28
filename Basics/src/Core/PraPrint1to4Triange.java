package Core;

public class PraPrint1to4Triange {
	
	public static void main (String arg[]){
		//System.out.print("x");
		//for(int i=4;i>=1;i--){
	/*	for(int i=1;i<=4;i++){	
			
			//for(int j=1;j<4;j++	){
			//	System.out.print(" ");
			//}
			
			for(int k=i;k<=4;k++){
				System.out.print(k);
			}
			 System.out.println(); 
		}*/
		
		int l=1;
		for (int i = 0; i < 5; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
            	
                System.out.print(" "+l++);
            }
            System.out.print("\n");
        }
		
		
		for(int a=0;a<4;a++){
			
			for(int b=4;b>a;b--){
				System.out.print(" ");
			}
			
			for(int c=1;c<=a+1;c++){
				System.out.print(" *");
			}
			System.out.println("");
		}
		
		for (int d=0;d<4;d++){
			
			for (int e=4;e>d;e--){
				System.out.print(" ");
			}
			for(int f=1;f<=d+1;f++){
				System.out.print(" *");
			}
			System.out.println("");	
		}
		
		
		// print 123456 in triangle share
		int ll=1;
		for(int ii=0;ii<3;ii++){
			for(int jj=3;jj>ii;jj--){
				System.out.print(" ");
			}
			for(int kk=1;kk<=ii+1;kk++){
				System.out.print(" "+ll++);
			}
			System.out.print("\n");
				
		}
		
		
		
	}

}
