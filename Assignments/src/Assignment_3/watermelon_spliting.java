package Assignment_3;
import java.util.*;
public class watermelon_spliting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int weight=s.nextInt();
int count=0;
for( int i=1;i<=weight;i++) {
	int j=weight-i;
		if(i+j==weight && i%2==0 && j%2==0 && weight>2) {
			 count++ ;
		  }
}
		if(count>=1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
  



