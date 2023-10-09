package Lecture_24;

public class spiral_array {
public static void spiralarray(int [][]arr) {
	int mini=0;
	int maxj=arr[0].length-1;
	int maxi=arr.length-1;
	int minj=0;
	int count=0;
	int total=arr.length*arr[0].length;
	while(count<total) {
		for(int i=minj;count<total && i<=maxj;i++) {
			System.out.print(arr[mini][i]+" ");
			count++;
		}
		mini++;
		for(int j=mini;count<total && j<=maxi;j++) {
			System.out.print(arr[j][maxj]+" ");
			count++;
		}
		maxj--;
		for(int i=maxj;count<total && i>=minj;i--) {
			System.out.print(arr[maxi][i]+" ");
			count++;
		}
		maxi--;
		for(int j=maxi;count<total && j>=mini;j--) {
			System.out.print(arr[j][minj]+" ");
			count++;
		}
		minj++;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {
				{1,2,3,4},
				{12,13,14,5},
				{11,16,15,6},
				{10,9,8,7}
		};
		spiralarray(arr);
	}

}
