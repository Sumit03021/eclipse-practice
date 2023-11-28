package hackathon_1;
import java.util.*;
public class monu_and_array {
public static int mindiff(int n1,int n2,int n3,int []A,int []B,int []C) {
	Arrays.sort(A);
	Arrays.sort(B);
	Arrays.sort(C);
	int ans=Integer.MAX_VALUE;
	int i=0;
	int j=0;
	int k=0;
	while(i<n1 &&j<n2 && k<n3) {
		int currmax=Math.max(Math.max(A[i],B[j]), C[k]);
		int currmin=Math.min(Math.min(A[i],B[j]),C[k]);
		int currdiff=currmax=currmin;
		ans=Math.min(ans, currdiff);
		if(A[i]==currmin) {
			i++;
		}else if(B[j]==currmin) {
			j++;
		}else {
			k++;
		}
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
int n3=s.nextInt();
int []A=new int[n1];
int []B=new int[n2];
int []C=new int[n3];
for(int i=0;i<n1;i++) {
	A[i]=s.nextInt();
}
for(int i=0;i<n2;i++) {
	B[i]=s.nextInt();
}
for(int i=0;i<n3;i++) {
	C[i]=s.nextInt();
}
int result=mindiff(n1,n2,n3,A,B,C);
System.out.println(result);
	}

}
