package firecracker;

import java.util.Random;

public class Cracker {
	
	
	
	 public static void main(String[] args) {
	        Random rand = new Random();
	        
	        for (int i = 0; i < 20; i++) { // loop 20 times
	            int n = rand.nextInt(1) + 1; // random number between 1 and 4
	            
	            switch (n) {
	                case 1:
	                    System.out.println("*");
	                    System.out.println("   BOOM!");
	                    System.out.println("   *   ");
	                    System.out.println("  ***  ");
	                    System.out.println(" ***** ");
	                    System.out.println("   *   ");
	                    break;
	               
	            }
	            
	            try {
	                Thread.sleep(100); // pause for 100 milliseconds
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        
	        System.out.println(); // move cursor to next line
	        System.out.println("BOOM!"); // print "BOOM!" at the end
	    }

}
