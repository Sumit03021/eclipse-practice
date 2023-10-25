package Lecture_26;
import java.util.*;
public class print_natural_number_decrease_order {
public static void naturalnumber(int n) {
	if(n==1) {
		System.out.print("1"+" ");
	return;
	}
	System.out.print(n+" ");
	naturalnumber(n+1);


return;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
naturalnumber(n);
	}

}
