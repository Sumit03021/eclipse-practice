package Easy_level;
import java.util.*;
public class count_negative_matrix {
public static int countnegative(int [][]grid) {
	int i=0;
	int count=0;
	int j=grid[0].length-1;
	while(i<grid.length && j>=0) {
		if(grid[i][j]<0) {
			j--;
			count++;
		}else if(grid[i][j]>=0) {
			i++;
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int n=s.nextInt();
int [][]arr=new int[m][n];
for( int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		arr[i][j]=s.nextInt();
	}
}
System.out.println(countnegative(arr));
	}

}
