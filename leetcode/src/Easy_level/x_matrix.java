package Easy_level;
import java.util.*;
public class x_matrix {
public static boolean xmatrix(int [][]grid) {
	for(int i=0;i<grid.length;i++) {
		for(int j=0;j<grid[i].length;j++) {
			if(i!=j && i+j!=grid.length-1) {
				if(grid[i][j]==0) {
					return true;
				}else if(grid[i][j]!=0) {
					return false;
				}
			}else if(i==j || i+j==grid.length-1){
				if(grid[i][j]!=0) {
					return true;
				}else if(grid[i][j]==0) {
					return false;
				}
			}	
}
	}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int [][]arr=new int[n][m];
for(int i=0;i<n;i++) {
	for(int j=0;j<m;j++) {
		arr[i][j]=s.nextInt();
	}
}
System.out.println(xmatrix(arr));
	}

}
