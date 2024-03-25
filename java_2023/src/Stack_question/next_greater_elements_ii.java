package Stack_question;
import java.util.*;
public class next_greater_elements_ii {
public static int [] nextgreater(int []arr) {
	int []ans=new int[arr.length];
	Stack<Integer>s=new Stack();
	for(int i=arr.length-1;i>=0;i--) {
		while(s.size()>0 && s.peek()<=arr[i]) {
			s.pop();
		}
		if(s.size()==0) {
			ans[i]=-1;
		}else{
			ans[i]=s.peek();
		}
		s.push(arr[i]);
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if use of any type pairing without cutting arrows using stack always.
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
