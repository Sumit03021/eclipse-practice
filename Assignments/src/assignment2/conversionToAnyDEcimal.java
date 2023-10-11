package assignment2;
import java.util.*;
public class conversionToAnyDEcimal {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		      //  System.out.print("Enter the source number system base (sb): ");
		        int sb = scanner.nextInt();

		       // System.out.print("Enter the destination number system base (db): ");
		        int db = scanner.nextInt();

		       // System.out.print("Enter the number in source format (sn): ");
		        String sn = scanner.next();

		        long result = convertBase(sn, sb, db);
		       System.out.println( result);

		        scanner.close();
		    }

		    public static long convertBase(String sn, int sb, int db) {
		        // Convert the source number to decimal
		        long decimalValue = Long.parseLong(sn, sb);

		        // Convert the decimal number to the destination base
		        String result = Long.toString(decimalValue, db);
		        return Long.parseLong(result);

		       


	}

}
