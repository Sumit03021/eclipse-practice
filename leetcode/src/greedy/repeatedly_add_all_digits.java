package greedy;
import java.util.*;
public class repeatedly_add_all_digits {
public static int minsum(int num) {
	if(num==0) {
		return 0;
	}else if(num%9==0) {
		return 9;
	}else {
		return num%9;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(minsum(n));
	}

}
