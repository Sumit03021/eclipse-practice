package arraylist;
import java.util.*;
public class count_number_of_sum_pairs_less_than_target {
public static int sumlesstarget(List<Integer>nums,int target) {
	int count=0;
	for(int i=0;i<nums.size();i++) {
		for(int j=i+1;j<nums.size();j++) {
			if(nums.get(i)+nums.get(j)<target) {
				count++;
			}
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int target=s.nextInt();
ArrayList<Integer>nums=new ArrayList<Integer>();

	}

}
