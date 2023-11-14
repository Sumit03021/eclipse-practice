package arraylist;
import java.util.*;
public class greatest_number_of_candies {
public static ArrayList<Boolean> greatestcandies(int []candies,int extraCandies){
	ArrayList<Boolean>arr=new ArrayList<Boolean>();
    int max=Integer.MIN_VALUE;
	for(int i=0;i<candies.length;i++) {
		if(max<candies[i]) {
			max=candies[i];
		}
	}
	for(int i=0;i<arr.size();i++) {
		if(candies[i]+extraCandies>=max) {
			arr.add(i,Boolean.valueOf(true));
		}else {
			arr.add(i,Boolean.valueOf(false));
		}
	}
	return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []candies=new int[n];
for(int i=0;i<n;i++) {
	candies[i]=s.nextInt();
}
int extraCandies=s.nextInt();
ArrayList<Boolean>arr=greatestcandies(candies,extraCandies);
for(int i=0;i<arr.size();i++) {
	System.out.print(arr.get(i)+" ");
}
	}

}
