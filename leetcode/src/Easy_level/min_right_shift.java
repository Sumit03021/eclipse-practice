package Easy_level;
import java.util.*;
public class min_right_shift {
public static int rightshift(int []nums) {
	int []news=new int[nums.length];
	for(int i=0;i<nums.length;i++) {
		news[i]=nums[i];
	}
for(int i=0;i<news.length-1;i++) {
	if(news[i]>news[i+1]) {
		int temp=news[i];
		news[i]=news[i+1];
		news[i+1]=temp;
	}
}
    int main=0;
    for(int j=0;j<nums.length;j++) {
    	int ans=0;
	for(int i=0;i<nums.length;i++) {
		if(news[i]==nums[(i+j)%nums.length]) {
			ans++;
			System.out.print(ans+" ");
		}else {
			ans=-1;
		}
	}
	main=ans;
    }
	return main;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
System.out.println(rightshift(arr));
	}

}
