package string;
import java.util.*;
public class color_chessboard {
public static boolean color(String coordinates) {
	char []arr=coordinates.toCharArray();
	int sum=0;
	for(int i=0;i<2;i++) {
		sum=sum+arr[i];
	}
	if(sum%2==0) {
		return false;
	}else {
		return true;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(color(str));
	}

}
