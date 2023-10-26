package Assignment_3;
import java.util.*;
public class alex_goes_shopping {
public static void shopping(int []arr,int money,int k) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
			if(money%arr[i]==0) {
				count++;
			}
		}
	
	if(count>=k) {
		System.out.println("YES");
	}else {
		System.out.println("NO");
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
	 int money=s.nextInt();
	 int k=s.nextInt();
	 shopping(arr,money,k);
 }
	}

}
