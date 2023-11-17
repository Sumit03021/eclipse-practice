package binary_search;
import java.util.*;
public class count_number_of_negative_elements_in_sorted_grid {
public static int countnegative(int [][]grid) {
	int count=0;
	for(int i=0;i<grid.length;i++) {
		for(int j=0;j<grid[0].length;j++) {
			if(grid[i][j]<0) {
			count=count+grid[0].length-j;
			break;
			}
		}
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int n=s.nextInt();
int [][]grid=new int[m][n];
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		grid[i][j]=s.nextInt();
	}
}
System.out.println(countnegative(grid));
	}

}
