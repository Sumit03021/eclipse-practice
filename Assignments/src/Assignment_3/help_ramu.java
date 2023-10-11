package Assignment_3;
import java.util.*;
public class help_ramu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int tc=s.nextInt();
int []ticket=new int[4];
for(int j=0;j<tc;j++) {
	for( int i=0;i<4;i++) {
		ticket[i]=s.nextInt();
	}
	int n=s.nextInt();
	int m=s.nextInt();
	int []rickshaw=new int[n];
	for(int i=0;i<n;i++) {
		rickshaw[i]=s.nextInt();
	}
	int minrick=0;
	for(int i=0;i<n;i++) {
		int currentmin=Math.min(rickshaw[i]*ticket[0],ticket[1]);
		minrick+=currentmin;
	}
	if(minrick>ticket[2]) {
		minrick=ticket[2];
	}
	int []cab=new int[m];
	for(int i=0;i<m;i++) {
		cab[i]=s.nextInt();
	}
	int mincab=0;
	for(int i=0;i<m;i++) {
		int currentmincab=Math.min(cab[i]*ticket[0],ticket[1]);
		mincab+=currentmincab;
	}
	if(mincab>ticket[2]) {
		mincab=ticket[2];
	}
	int ans=Math.min(mincab+minrick, ticket[3]);
	System.out.println(ans);
}
	}
}
