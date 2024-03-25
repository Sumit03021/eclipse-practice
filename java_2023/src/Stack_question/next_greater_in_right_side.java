package Stack_question;
import java.util.*;
public class next_greater_in_right_side {
public static int [] nextgreater(int []arr) {
	int []ans=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		int ans_val=-1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				ans_val=arr[j];
				break;
			}
			ans[i]=ans_val;
		}
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int []ans=nextgreater(arr);
for(int i=0;i<n;i++) {
	System.out.print(ans[i]+" ");
}
	}

}
