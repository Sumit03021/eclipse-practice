package arrays;
import java.util.*;
public class maximum_monster_killed {
public static int maxmonster(int []dist,int []speed) {
	int count=0;
	if(dist[0]==0) {
		 count=0;
	}else {
		count=1;
	}
	int []arr=new int[speed.length];
	for(int i=1;i<arr.length;i++) {
		arr[i]=speed[i]*i;
	}
	for(int i=1;i<arr.length;i++) {
		if(dist[i]>arr[i]) {
			count++;
		}else {
			break;
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []dist=new int[n];
int []speed=new int[n];
for(int i=0;i<n;i++) {
	dist[i]=s.nextInt();
}
for(int i=0;i<n;i++) {
	speed[i]=s.nextInt();
}
System.out.println(maxmonster(dist,speed));
	}

}
