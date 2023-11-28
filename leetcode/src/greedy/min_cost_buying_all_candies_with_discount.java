package greedy;
import java.util.*;
public class min_cost_buying_all_candies_with_discount {
public static int mincost(int []cost) {
	Arrays.sort(cost);
	int price=0;
	if(cost.length==1) {
		return cost[0];
	}else if(cost.length==2) {
		return cost[0]+cost[1];
	}else {
		if(cost.length%3==0) {
			for(int i=0;i<cost.length;i=i+3) {
				price+=cost[i+1]+cost[i+2];
			}
		}else if(cost.length%3==1){
		   for(int i=0;i<cost.length-1;i=i+3) {
			   price+=cost[i+1]+cost[i+2];
		   }
		   price=price+cost[cost.length-1];
		}else {
			   for(int i=0;i<cost.length-2;i=i+3) {
				   price+=cost[i+1]+cost[i+2];
			   }
			   price=price+cost[cost.length-1]+cost[cost.length-2];
		}
	}
	return price;
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
