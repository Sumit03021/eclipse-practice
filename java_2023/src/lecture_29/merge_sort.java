package lecture_29;
import java.util.*;
public class merge_sort {
public static int [] merge(int []arr1,int []arr2) {
	int []ans=new int[arr1.length+arr2.length];
	int index=0;
	int i=0;
	int j=0;
	while(i<arr1.length && j<arr2.length) {
		if(arr1[i]<arr2[j]) {
			ans[index]=arr1[i];
			index++;
			i++;
		}else{
			ans[index]=arr2[j];
			index++;
			j++;
		}
        
	}
	
	while(i<arr1.length) {
		
		ans[index]=arr1[i];
		index++;
		i++;
	}
	
	while(j<arr2.length) {
		
		ans[index]=arr2[j];
		index++;
		j++;
	}
	
	
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int n=s.nextInt();

int []arr1=new int[m];
int []arr2=new int[n];
for(int i=0;i<m;i++) {
	arr1[i]=s.nextInt();
}
for(int i=0;i<n;i++) {
	arr2[i]=s.nextInt();
}
int []merge=merge(arr1,arr2);
for(int i=0;i<merge.length;i++) {
	System.out.print(merge[i]+" ");
}
	}

}
