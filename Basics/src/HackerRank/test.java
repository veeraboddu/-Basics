package HackerRank;

public class test {
	
	   public static void main(String args[]) 
	   {
		   int i , j;
			i = j = 3;
		        int n = 2 * ++i;
		        int m = 2 * j++;
		        System.out.println(i + " " + j + " " + n + " " + m);
		        
		        String str = "!@#$Meghana)(*Sunitha&^%Murthy";
		        
		        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
	   }

}