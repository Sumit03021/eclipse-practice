package maths;
import java.util.*;
public class simplified_fractions {
public static List<String> fractions(int n){
	int []arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=i+1;
	}
	ArrayList<String>num=new ArrayList<String>();
	String ans="";
	String ans1="";
	for(int i=1;i<n;i++) {
		ans=ans+arr[0]+"/"+arr[i];
		num.add(ans);
		ans="";
	}
	for(int i=1;i<n;i++) {
		for(int j=2;j<n;j++) {
			if(arr[j]%arr[i]!=0 &&arr[i]%2!=0 &&arr[j]%2!=0 && arr[i]<arr[j]) {
				ans1=ans1+arr[i]+"/"+arr[j];
				num.add(ans1);
				ans1="";	
			}
		}
		
	}
	return num;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
List<String>arr=fractions(n);
for(int i=0;i<arr.size();i++) {
	System.out.print(arr.get(i)+" ");
}
	}

}
