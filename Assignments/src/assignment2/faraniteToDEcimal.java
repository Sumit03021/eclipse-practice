package assignment2;
import java.util.*;
public class faraniteToDEcimal {

	public static void main(String[] args) {
		
		
		        Scanner scanner = new Scanner(System.in);
		        
		     //   System.out.print("Enter the minimum Fahrenheit value: ");
		        int minFahrenheit = scanner.nextInt();
		        
		      //  System.out.print("Enter the maximum Fahrenheit value: ");
		        int maxFahrenheit = scanner.nextInt();
		        
		       // System.out.print("Enter the step: ");
		        int step = scanner.nextInt();
		        
		       // System.out.println("Fahrenheit  Celsius");
		        for (int f = minFahrenheit; f <= maxFahrenheit; f += step) {
		            int celsius = (int) ((5.0/9.0) * (f - 32));
		            System.out.print(f +"\t");
		            System.out.println(celsius);
		        }
		        
		        scanner.close();
		    }
		}



	
