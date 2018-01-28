package Practice;

import java.util.Random;

public class FlipperThree {
    public static void main(String[] args) { 
        System.out.println("Welcome to Flipper!");
        int previousFlip = -1;
        int continuousFlip = 0;
        int totalFlips = 0;
        String[] ht = new String[] {"Heads","Tails"};
        Random r = new Random();
        while (continuousFlip < 3) {
            int r1 = r.nextInt(ht.length);
            totalFlips++;
            System.out.println(ht[r1]);
            if(previousFlip == r1){
                continuousFlip++;
            } else {
                continuousFlip = 1;
                previousFlip = r1;
            }
        }
        System.out.println("BINGO!That only took " + totalFlips +" flips to get 3 in a row!");
    }
}