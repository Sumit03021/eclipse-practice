package Assignment_5;
import java.util.*;
public class largest_possible_number_ii {
public static void largenumber(int []arr) {
	int []arr1=new int[arr.length];
	int []count=new int[arr.length];
	int ans=0;
	for(int i=0;i<arr.length;i++) {
		arr1[i]=arr[i];
		while(arr[i]>0) {
			arr[i]=arr[i]/10;
			count[i]++;
		}
		ans=Math.max(ans,count[i]);
	}
	for(int i=0;i<arr.length;i++) {
		if(count[i]==ans) {
			arr[i]=arr1[i];
		}else {
			arr[i]=arr1[i]*(int)Math.pow(10,ans-count[i]);
		}
	}
	int []rank=new int[arr.length];
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr.length;j++) {
    		if(arr[i]>arr[j]&& j!=i) {
    			rank[i]++;
    		}
    	}
    }
    int []arr2=new int[arr.length];
    int []count1=new int[arr.length];
    for(int i=0;i<arr.length;i++) {
    	arr2[rank[i]]=arr1[i];
    	count1[rank[i]]=count[i];
    }
    long val=1;
    int sum=0;
	for(int i=arr.length-1;i>=0;i--) {
		sum=sum+count1[i];
		val=val*(int)Math.pow(10,count1[i])+arr2[i];
	}
	long val1=1*(long)Math.pow(10, sum);
	long largeval=(long)(val%val1);
	System.out.println(largeval);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
		int n=s.nextInt();
		int []arr=new int[n];
		for(int j=0;j<n;j++) {
			arr[j]=s.nextInt();
		}
largenumber(arr);
		}
}
}