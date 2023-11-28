package lecture_29;
import java.util.*;
public class sum_of_natural_number {
public static int a1(int n) {
	int add=0;
	for(int i=1;i<=n;i++) {
		add=add+i;
	}
	return add;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner s=new Scanner(System.in);
//int sum=n*(n+1)/2;
//System.out.println(sum);
long start=System.nanoTime();
System.out.println(a1(10));
long end=System.nanoTime();
System.out.println(end-start);
//round robin algo---
//context switching---give partial time to one than other then again came
//to give partial time and completed processing.

//asymtotic analysis---time complexity---count number of operations/instructions.
//time complexity---no. of operations w.r.t to change in input.
	}

}
