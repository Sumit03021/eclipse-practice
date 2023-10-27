package Easy_level;
import java.util.*;
public class number_reactangle_form_largest_square {
public static int maxpossiblesquare(int [][]rectangles) {
	int []largestsquare=new int[rectangles.length];
	for(int i=0;i<rectangles.length;i++) {
		for(int j=0;j<2;j++) {
			largestsquare[i]=Math.min(rectangles[i][0],rectangles[i][1]);
		}
	}
	int max=Integer.MIN_VALUE;
	for(int i=0;i<rectangles.length;i++) {
		if(max<largestsquare[i]) {
			max=largestsquare[i];
		}
	}
	int count=0;
	for(int i=0;i<rectangles.length;i++) {
		if(largestsquare[i]==max) {
			count++;
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int [][]arr=new int[n][2];
for(int i=0;i<n;i++) {
	for(int j= 0;j<2;j++) {
		arr[i][j]=s.nextInt();
	}
}
System.out.println(maxpossiblesquare(arr));
	}

}
