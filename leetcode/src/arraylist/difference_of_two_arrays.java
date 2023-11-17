package arraylist;
import java.util.*;
public class difference_of_two_arrays {
public static List<List<Integer>> diffarr(int []nums1,int []nums2){
	//not solved
	ArrayList<List<Integer>>arr=new ArrayList<List<Integer>>();
	List<Integer>list1=new ArrayList<Integer>();
	List<Integer>list2=new ArrayList<Integer>();
	 for(int k=0;k<nums1.length;k++) {
		 list1.add(nums1[k]);
	 }
	 for(int k=0;k<nums1.length;k++) {
		 list2.add(nums2[k]);
	 }
	
		 for(int i=0;i<nums1.length;i++) {
			 for(int j=0;j<nums2.length;j++) {
				 if(list1.get(i)==list2.get(j)) {
					 list1.remove(i);
					 list2.remove(j);
				 }
			 }
		 }
		arr.add(list1);
		arr.add(list2);
		return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int []num1=new int[n];
int []num2=new int[m];
for(int i=0;i<n;i++) {
	num1[i]=s.nextInt();
}
for(int i=0;i<m;i++) {
	num2[i]=s.nextInt();
}
List<List<Integer>>list = diffarr(num1,num2);
for(int i=0;i<list.size();i++) {
	System.out.println(list.get(i));
}
	}

}
