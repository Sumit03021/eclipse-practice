package Lecture_21;

public class can_placed_cow {
public static boolean can_i_placed(int []arr,int n,int c,int d) {
	int how_much_placed=1;
	int last_placed_cow=arr[0];
	for(int i=1;i<n;i++) {
		int cur_dis=arr[i]-last_placed_cow;
		if(cur_dis >=d) {
			how_much_placed++;
			last_placed_cow=arr[i];
		}
	}
	if(how_much_placed>=c) {
		return true;
	}else {
		return false;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {1,2,4,8,9};
for(int d=1;d<=100;d++) {
System.out.print(d +" => "+can_i_placed(arr,arr.length,3,d)+", ");

	}
	}
}
