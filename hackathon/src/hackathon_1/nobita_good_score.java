package hackathon_1;
import java.util.*;
public class nobita_good_score {
	public static void mincandy(int []arr) {
		int ans=arr[0]%arr[1];
		if(ans>arr[1]/2) {
			ans=arr[1]-ans;
		}else {
			ans=ans+0;
		}
		System.out.println(ans);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	for(int i=0;i<t;i++) {
		int []arr=new int[2];
		for(int j=0;j<2;j++) {
			arr[j]=s.nextInt();
		}
		mincandy(arr);
	}
	}

}
