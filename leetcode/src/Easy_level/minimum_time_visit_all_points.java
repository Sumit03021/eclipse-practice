package Easy_level;
import java.util.*;
public class minimum_time_visit_all_points {
public static int mintimevisit(int [][]points) {
	int mintime=0;
	for(int i=0;i<points.length-1;i++) {
     int max= Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));
      mintime=mintime+max;
	}
	return mintime;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int [][]arr=new int[n][2];
for(int i=0;i<n;i++) {
	for(int j=0;j<2;j++) {
		arr[i][j]=s.nextInt();
	}
}
System.out.println(mintimevisit(arr));
	}

}
