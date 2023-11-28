package dynamic_programing;
import java.util.*;
public class jump_game {
public static boolean jumpgame(int []nums) {
	int jump=0;
	for(int i=0;i<nums.length;i++) {
		if(i>jump) {
			return false;
		}
		jump=Math.max(jump, i+nums[i]);
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
System.out.println(jumpgame(arr));
	}

}
