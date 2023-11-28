package Lecture_28;
import java.util.*;
public class rat_cheese_recurrsion {
public static void rat(int currrow,int currcol,int dr,int dc,String ans) {
	if(currrow==dr &&currcol==dc) {
		System.out.println(ans);
		return ;
	}
	if(currrow >dr || currcol >dc) {
		return;
	}
	rat(currrow+1,currcol,dr,dc,ans+"R");
	rat(currrow,currcol+1,dr,dc,ans+"D");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int row=s.nextInt();
int col=s.nextInt();
rat(0,0,row,col,"");

	}

}
