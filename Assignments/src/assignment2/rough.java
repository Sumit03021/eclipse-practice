package assignment2;
import java.util.*;
public class rough {

	public static void main(String[] args) {
		
		
		        Scanner scanner = new Scanner(System.in);
		        int t = scanner.nextInt(); // Number of test cases

		        for (int i = 0; i < t; i++) {
		            int m = scanner.nextInt(); // Maximum smartphones Aayush can purchase
		            int n = scanner.nextInt(); // Maximum smartphones Harshit can purchase

		            // Calculate the maximum number of smartphones that can be purchased by each player
		            int aayushMax = (int) (Math.sqrt(1 + 8 * (long) m) - 1) / 2;
		            int harshitMax = (int) (Math.sqrt(1 + 8 * (long) n) - 1) / 2;

		            // Determine the winner
		            if (aayushMax <= harshitMax) {
		                System.out.println("Aayush");
		            } else {
		                System.out.println("Harshit");
		            }
		        }
		    }
		}

