package Easy_level;
import java.util.*;
public class minimum_moves_seat_everyone {
public static int minseatmoves(int []seats,int []students) {
	int sum=0;
	Arrays.sort(seats);
	Arrays.sort(students);
	for(int i=0;i<seats.length;i++) {
		sum=sum+Math.abs(seats[i]-students[i]);
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []seat=new int[n];
int []student=new int[n];
for(int i=0;i<n;i++) {
	seat[i]=s.nextInt();
}
for(int i=0;i<n;i++) {
	student[i]=s.nextInt();
}
System.out.println(minseatmoves(seat,student));
	}

}
