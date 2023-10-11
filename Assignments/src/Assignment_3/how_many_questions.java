package Assignment_3;
import java.util.*;
public class how_many_questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int t=s.nextInt();
int count=0;
for(int i=0;i<t;i++) {
	int []arr=new int[3];
	for(int j=0;j<3;j++) {
		arr[j]=s.nextInt();
	}
	if(arr[0]+arr[1]+arr[2]>=2) {
		count++;
	}
}
System.out.println(count);
	}

}
