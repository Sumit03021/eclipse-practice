package Easy_level;
import java.util.*;
public class Missing_number {
public static int missingNumber(int []nums) {
	int []news = new int[nums.length+1];
	for(int i=0;i<news.length;i++) {
		news[i]=i;
	}
	Arrays.sort(nums);
	int ans=news[news.length-1];
	for(int i=0;i<nums.length;i++) {
		if(news[i]!=nums[i]) {
			ans=news[i];
			break;
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
int ans=missingNumber(arr);
System.out.println(ans);

	}

}
