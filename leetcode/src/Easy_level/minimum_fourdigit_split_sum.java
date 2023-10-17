package Easy_level;
import java.util.*;
public class minimum_fourdigit_split_sum {
public static void minsplitsum(int [] n) {
      int []n1=new int[12];
      n1[0]=n[0]*10+n[1];
      n1[1]=n[0]*10+n[2];
      n1[2]=n[0]*10+n[3];
     n1[3]=n[1]*10+n[0];
     n1[4]=n[1]*10+n[2];
      n1[5]=n[1]*10+n[3];
      n1[6]=n[2]*10+n[0];
      n1[7]=n[2]*10+n[1];
      n1[8]=n[2]*10+n[3];
      n1[9]=n[3]*10+n[0];
      n1[10]=n[3]*10+n[1];
      n1[11]=n[3]*10+n[2];
        for(int i=0;i<12;i++) {
    	  System.out.print(n1[i]+" ");
      }
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
     for(int i=0;i<12;i++) {
    	 for(int j=0;j<12;j++) {
    	 if(min1>n1[i]) {
    		 min1=n1[i];
    	 }
    	 if(min2>n1[j] && n1[j]!=min1) {
    		 min2=n1[j];
    	 }
     }
     }
     System.out.println(min1);
     System.out.println(min2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int []arr=new int[4];
for(int i=0;i<4;i++) {
	arr[i]=s.nextInt();
}
minsplitsum(arr);
	}

}
