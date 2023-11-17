package arrays;
import java.util.*;
public class min_cost_move_chips_same_position {
	
public static int mincost(int []position) {
    int max=0;
    int positions=-1;
    int cost=0;
	for(int i=0;i<position.length;i++) {
    	int count=0;
    	for(int j=0;j<position.length;j++){
    		if(position[i]==position[j]) {
    			count++;
    		}else {
    			continue;
    		}
    		max=Math.max(max,count);
    		if(max==count) {
    			positions=position[i];
    		}
    	}
    }
	for(int i=0;i<position.length;i++) {
		if((position[i]-positions)%2==0) {
			position[i]=positions;
		}else {
			position[i]=positions;
			cost++;
		}
	}
    System.out.println(max);
    System.out.println(positions);
     return cost;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
System.out.println(mincost(arr));
	}

}
