package Assignment_5;
import java.util.*;
public class remove_duplicate {
	public static int count(char []str,int n,int i) {
		int count=0;
		for(i=i;i<str.length;i++) {
			if(str[i]!=n) {
				break;
			}else {
				count++;
			}
		}
		
		return count;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	String str=s.next();
	char []arr=str.toCharArray();
	int j=0;
	for(int i=0;i<arr.length;i=i+j) {
		System.out.print(arr[i]);
		int count=count(arr,arr[i],i);
		j=count;
	}

	}

}
