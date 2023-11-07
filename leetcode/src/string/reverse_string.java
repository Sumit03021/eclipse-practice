package string;
import java.util.*;
public class reverse_string {
public static void reverse(char []s) {
	int i=0;
	int j=s.length-1;
	while(i<=j) {
		char temp=s[i];
		s[i]=s[j];
		s[j]=temp;
		i++;
		j--;
	}
	System.out.println("[");
	for(int k=0;k<s.length-1;k++) {
		System.out.print(s[k]+", ");
	}
	System.out.println(s[s.length-1]+"]");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
char []arr= {104,101,108,108,111};
//int n=s.nextInt();
//char []arr=new char[n];
//for(int i=0;i<arr.length;i++) {
//	arr[i]=s.next().charAt(i);
//}
reverse(arr);
	}

}
