package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class example
{
	public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("Hello Java");
        
      //  squareMatrix();
        //•	Two lists, 1,2,3 and 1,2,3,4,5, write a program to find the difference in these two lists. Using arrays OR hasmaps OR nested for loop, and to write test cases based on these.
        diffTwoLists();
        // •	Series of numbers and to write a program to arrange it in an array in square matrix
        arrSquareMatrix();
        
        bubbleSort();
        
        squareMatrix4_4();
        linkedlistReverse();
        separateNumbersFromStr();
        fizzBuzz();
        matrix3_3();
    }
    
public static void squareMatrix(){
        
        int m = 4, n =4;
        int a[][]= new int[m][n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+n+" "+m+"Matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
                System.out.println(i+" ,"+j);
            }
        }
        
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                // checking the condition 
                if(i == 2 || j == 1){
                	a[i][j] = 1;
                }else{
                	a[i][j] = 0;
                }
                                           
            }    
         }    
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(a[i][j]);
                System.out.println(i+" ,"+j);
            }
        }
        
    }

public static void diffTwoLists(){
	
	List l1 = new ArrayList();
	List l2 = new ArrayList();
	
	System.out.println("diffTwoLists ");
	l1.add("1");l1.add("2");l1.add("3");
	l2.add("1");l2.add("2");l2.add("3");l2.add("4");l2.add("5");l2.add("6");
	l2.removeAll(l1);
	
	System.out.println(l2);
	
}

public static void arrSquareMatrix(){
	
	int a[][] = new int[4][4];
	int count =1;
	for(int i=0;i<4;i++){
		System.out.println();
		for(int j=0;j<4;j++){
			a[i][j] =count++;
			System.out.print(" "+a[i][j]);
		}
	}
}

public static void bubbleSort(){
	
	int a[]={2,7,8,4,6,9},temp=0;
	System.out.println(" *************************");
	for(int i=0;i<a.length-1;i++){
		for(int j=0;j<a.length-1;j++){
			if(a[j]>a[j+1]){
				temp =a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
	}	
	
	for(int i=0;i<a.length;i++){
		System.out.println(" "+a[i]);
	}
	
}

public static void squareMatrix4_4(){
	
	int count =1;
	int a[][] = new int[4][4];
	for(int i=0;i<4;i++){
		System.out.println(" \n");
		for(int j=0;j<4;j++){
			a[i][j]=count++;
			System.out.print(" "+a[i][j]);
		}
	}
	
}

public static void linkedlistReverse(){
	
	LinkedList<String> l1 = new LinkedList<>();
	l1.add("suni");
	l1.add("Mega");
	l1.add("Veera");
	l1.add("Saraswathi");
	l1.add("Jaggarao");
	System.out.println(l1);
	Collections.reverse(l1);
	System.out.println(l1);
	//for(int i=0)
	
}

public static void separateNumbersFromStr(){
    	
 String str = "suni123tha";
 String intValue="";
 String charValue="";
 
 for(int i=0;i<str.length();i++){
	 if(Character.isDigit(str.charAt(i))){
		 intValue = intValue+ str.charAt(i);
		 System.out.println(str.charAt(i)+" Is integer");
	 }else{
		 charValue = charValue+ str.charAt(i);
		 System.out.println(str.charAt(i)+" Is Char");
	 }	 
 }
 System.out.println("Chars :"+ charValue);
 System.out.println("Integers :"+ intValue);
 
}

public static void fizzBuzz(){
	int givenNumber = 3;
	System.out.println("Fizz Buzz program ");
	if(givenNumber%5 == 0 && givenNumber%3 == 0){
		System.out.println("FizzBuzz");
	}else if(givenNumber%5 == 0){
		System.out.println("Fizz");
	}else if(givenNumber%3 == 0){
		System.out.println("Buzz");
	}
}

public static void matrix3_3(){
	
	int a[][] = new int[3][3];
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
				a[i][j] =1;
		}
	}	
	
	for(int i=0;i<3;i++){
		System.out.println(" ");
		for(int j=0;j<3;j++){
			System.out.print(a[i][j]);
		}
	}	
	
	for(int i=0;i<3;i++){
		System.out.println(" ");
		for(int j=0;j<3;j++){
			if(i==0 | j ==0 | j==1 | i == 1){
				a[i][j] =0;
			}else{
				a[i][j] =1;
			}
		}
	}
	for(int i=0;i<3;i++){
		System.out.println(" ");
		for(int j=0;j<3;j++){
			System.out.print(a[i][j]);
		}
	}	
	
}

}
