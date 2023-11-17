package binary_search;
import java.util.*;
public class interaction_of_two_array {
public static int [] interaction(int []nums1,int []nums2) {
 ArrayList<Integer>arr=new ArrayList<Integer>();
 int i=0;
 int j=0;
 Arrays.sort(nums1);
 Arrays.sort(nums2);
 while(i<nums1.length && j<nums2.length) {
	 if(nums1[i]==nums2[j]) {
		 arr.add(nums1[i]);
		 i++;
		 j++;
	 }else if(nums1[i]<nums2[j]) {
		 i++;
	 }else if(nums1[i]>nums2[j]) {
		 j++;
	 }
 }
 for(int l=0;l<arr.size();l++) {
	 for(int k=0;k<arr.size();k++) {
		 if(arr.get(k)==arr.get(l) && k!=l) {
			 arr.remove(k);
		 }
	 }
 }

	int []array=new int[arr.size()];
	for(int k=0;k<array.length;k++) {
		array[k]=arr.get(k);
	}
	return array;
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
int []arr=interaction(num1,num2);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}

}
