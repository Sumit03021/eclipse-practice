package binary_search;
import java.util.*;
public class character_greater_than_target {
public static char greater(char []letters,char target) {
	
	for(int i=0;i<letters.length;i++) {
		if(letters[i]>target) {
			return letters[i];
		}
	}
	return letters[0];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
char []arr=new char[n];
for(int i=0;i<n;i++) {
	arr[i]=s.next().charAt(i);
}
char target=s.next().charAt(0);
System.out.println(greater(arr,target));
	}

}
