package Assignment_3;
import java.util.*;
public class alex_goes_shopping {
public static void shopping(int []arr) {
	Scanner s=new Scanner(System.in);
	int count=0;
	int []choice=new int[2];
	for(int i=0;i<2;i++) {
		choice[i]=s.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
	if(choice[0]>=arr[i]) {
		count++;
	}
} 
	int money=0;
	for(int i=0;i<arr.length;i++) {
		money+=arr[i];
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
}
int q=s.nextInt();
 for(int i=0;i<q;i++) {
	 shopping(arr);
 }
	}

}
