package Lecture_27;

public class fibonacci_series {
public static int fibo(int n) {
	if(n==1) {
		return 1;
	}
	if(n==0) {
		return 0;
	}
	
	int chhota0=fibo(n-2);
	int chhota1=fibo(n-1);
	int bada_ans=chhota1+chhota0;
	
	return bada_ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=18;
System.out.println(fibo(n));

	}

}
