package maths;
import java.util.*;
public class maximum_score_from_remove_stones {
public static int maxscore(int a,int b, int c) {
	int max= Math.max(a, Math.max(b, c));
	int min=Math.min(a,Math.min(c, b));
	int score=a+b+c-max-min;
	if(min+score<max) {
		return min+score;
	}else {
		return (a+b+c)/2;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
System.out.println(maxscore(a,b,c));
	}

}
