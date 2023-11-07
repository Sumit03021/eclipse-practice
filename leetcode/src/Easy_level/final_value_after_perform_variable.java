package Easy_level;
import java.util.*;
public class final_value_after_perform_variable {
public static int afteroperations(String[]operations) {
	int x=0;
	int n=operations.length;
	for(int i=0;i<n;i++) {
		if(operations[i]==174) {
			x=x+1;
			System.out.println(x);
		}else if(operations[i]==178) {
			x=x-1;
			System.out.println(x);
		}
	}
	return x;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String[]str=new String[n];
for(int i=0;i<n;i++) {
	str[i]=s.next();
}
System.out.println(afteroperations(str));
	}

}
