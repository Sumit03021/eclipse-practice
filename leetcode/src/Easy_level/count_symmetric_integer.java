package Easy_level;
import java.util.*;
public class count_symmetric_integer {
public static int count(int low,int high ) {
	int countinteger=0;
	for(int i=low;i<=high;i++) {
		int countdigit=0;
		int num=i;
		while(num>0) {
			countdigit++;
			num=num/10;
		}
		int nums=i;
		if(countdigit%2==0) {
			int firstsum=0;
			int lastsum=0;
			int ans=countdigit/2;
			while(countdigit > ans) {
				int ld=nums%10;
				lastsum=lastsum+ld;
				nums=nums/10;
				countdigit--;
			}
			while(nums>0) {
				int ld1=nums%10;
				firstsum=firstsum+ld1;
				nums=nums/10;
			}
			if(firstsum==lastsum) {
				countinteger++;
			}
		}
		
	}
	return countinteger;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
System.out.println(count(n,m));
	}

}
