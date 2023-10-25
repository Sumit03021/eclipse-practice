package Lecture_27;

public class coin_toss {
public static void printcoin(int n,String ans) {
	if(n==0) {
		System.out.print(ans+" ");
		return;
	}
		printcoin(n-1,ans+"H");
		printcoin(n-1,ans+"T");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
printcoin(n,"");
	}

}
