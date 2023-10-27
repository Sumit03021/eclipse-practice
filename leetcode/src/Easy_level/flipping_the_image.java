package Easy_level;
import java.util.*;
public class flipping_the_image {
public static int[][] flipandinverted(int [][]image){
	int n=image.length;
	for(int i=0;i<n;i++) {
		int s=0;
		int e=image[0].length-1;
		while(s<=e) {
			int temp=image[i][s];
			image[i][s]=image[i][e];
			image[i][e]=temp;
			s++;
			e--;
		}
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
		if(image[i][j]==0) {
			image[i][j]=1;
		}else if(image[i][j]==1) {
			image[i][j]=0;
		}
		}
	}
	return image;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int [][]arr=new int[n][n];
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		arr[i][j]=s.nextInt();
	}
}
int [][]image=flipandinverted(arr);
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		System.out.print(image[i][j]+" ");
	}
	System.out.println();
}
	}

}
