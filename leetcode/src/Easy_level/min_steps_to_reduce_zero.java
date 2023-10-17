package Easy_level;
import java.util.*;
public class min_steps_to_reduce_zero {
public static int minstepzero(int num) {
	int count=0;
    while(num >0) {
    
	if(num%2==0) {
		num=num/2;
	}else {
		num=num-1;
	}
	count++;
    }
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(minstepzero(n));
	}

}
