package greedy;
import java.util.*;
public class min_time_to_type_character_in_special_typewriter {
public static int mintime(String word) {
	int time=word.length();
	if(word.charAt(0)>=97) {
		time=time + Math.min(Math.abs(97-word.charAt(0)),Math.abs(123-word.charAt(0)));
	}
	for(int i=1;i<word.length();i++) {
       if(word.charAt(i-1)>word.charAt(i)) {
    	   time=time+Math.min(Math.abs(word.charAt(i)-word.charAt(i-1)),Math.abs(word.charAt(i)-word.charAt(i-1)+26));
       }else if(word.charAt(i-1)==word.charAt(i)){
    	   time=time;
       }else {
    	   time=time+Math.min(Math.abs(word.charAt(i)-word.charAt(i-1)),Math.abs(word.charAt(i)-word.charAt(i-1)-26));  
       }
	//time=time+ Math.min(Math.abs(word.charAt(i-1)-word.charAt(i)-13),Math.min(Math.abs(word.charAt(i-1)-word.charAt(i)),Math.abs(word.charAt(i-1)-word.charAt(i)+13)));
	}
	return time;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(mintime(str));
	}

}
