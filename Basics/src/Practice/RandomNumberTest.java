// Random Generation Numbers
// @ Author : Veera

package Practice;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumberTest {
	
	public static void main(String arg[]){
		randomNumberGeneration();
		listOfDuplicates();
	}
	
public static void randomNumberGeneration(){
		
	// Used Random Object  from util package to generate the random numbers
		Random r =new Random();
		System.out.println("Random numbers below 10");
		for(int i=0;i<5;i++)
			// Generated the random number between the range of 0 to 4
			System.out.println(r.nextInt(5));
	}

public static void listOfDuplicates(){
	
	int a[] =  {1,2,3,1,2,5};
	Set<Integer> non_duplicateList= new HashSet<>();
	Set<Integer> duplicateList= new HashSet<>();
	
	for(int i=0;i<a.length;i++){
		if(!non_duplicateList.contains(a[i])){
			non_duplicateList.add(a[i]);
		}else{
			duplicateList.add(a[i]);
		}
	}
	
	System.out.println(duplicateList);
}

}

//Output : [1, 2]

