package assignment2;
import java.util.*;
public class shoppingGame {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int times=scanner.nextInt();
		        int M = scanner.nextInt();
		        int N = scanner.nextInt();
		        for(int i=1;i<=times;i++) {

		        int aayush = 0;
		        int harshit = 0;
		        int turn = 1; // 1 represents Aayush, 2 represents Harshit

		        while (M >= aayush && N >= harshit) {
		            if (turn == 1) {
		                aayush += (2 * turn - 1);
		                turn = 2;
		            } else {
		                harshit += (2 * turn - 1);
		                turn = 1;
		            }
		        }

		        if (aayush > M) {
		            System.out.println("Harshit");
		        } else {
		            System.out.println("Aayush");
		        }
		        
		        }

		        scanner.close();
		    }
		}


	
