package Easy_level;
import java.text.DecimalFormat;
import java.util.*;
public class convert_temperature {
public static double [] converttemp(double celsius) {
	double []arr=new double[2];
	arr[0]=celsius +273.15;
	arr[1]=celsius*1.80+32.00;
	return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
double c=s.nextDouble();
double []arr=converttemp(c);
for(int i=0;i<2;i++) {
	System.out.println(arr[i]);
}
	}

}
