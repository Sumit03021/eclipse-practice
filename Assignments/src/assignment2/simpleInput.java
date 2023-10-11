package assignment2;
import java.util.*;
public class simpleInput {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        ArrayList<Integer> numbers = new ArrayList<>();
		        int cumulativeSum = 0;

		        while (scanner.hasNextInt()) {
		            int num = scanner.nextInt();
		            cumulativeSum += num;
		            
		            if (cumulativeSum < 0) {
		                break;
		            }
		            
		            numbers.add(num);
		        }

		        for (Integer num : numbers) {
		            System.out.println(num);
		        }
		    }
		}

		      
