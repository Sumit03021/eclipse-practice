package arrays;
import java.util.*;
public class piles_of_coins {
public static int maxcoins(int []piles) {
	Arrays.sort(piles);
	int coins=0;
	for(int i=(piles.length/3);i<piles.length;i+=2) {
		coins=coins+piles[i];
	}
	return coins;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int []piles=new int[n];
for(int i=0;i<n;i++) {
	piles[i]=s.nextInt();
}
System.out.println(maxcoins(piles));
	}

}
