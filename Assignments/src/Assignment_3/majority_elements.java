package Assignment_3;
import java.util.*;
public class majority_elements {
public static int [] majority(int []arr) {
	int n=arr.length;
	Arrays.sort(arr);
	int []majority=new int[arr[n-1]+1];
	for(int i=0;i<n;i++) {
		int index=arr[i];
		majority[index]++;
		}
	int []newarr=new int[majority.length];
	for(int i=0;i<majority.length;i++) {
		if(majority[i]>Math.floorDiv(n,3)) {
			newarr[i]=i;
		}else {
			newarr[i]=-1;
		}
	}
	int count=0;
	for(int i=0;i<majority.length;i++) {
		if(newarr[i]>=0) {
			count++;
		}
	}
	Arrays.sort(newarr);
	for(int j=0;j<majority.length;j++) {
	for(int i=0;i<majority.length-1;i++) {
		if(newarr[i]==-1) {
			int temp=newarr[i];
			newarr[i]=newarr[i+1];
			newarr[i+1]=temp;
		}
	}
	}
	int []elements=new int[count];
	for(int i=0;i<count;i++) {
		elements[i]=newarr[i];
	}
	return elements;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}

int []majority=majority(arr);
if(majority.length==0) {
	System.out.println("No Majority Elements");
}else {
for(int i=0;i<majority.length;i++) {
	System.out.print(majority[i]+" ");
}
	}
	}
}
