package hashmap_question;
import java.util.*;
public class two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []num = {2,7,11,15};
int target =9;
HashMap<Integer,Integer>mh =new HashMap();
for(int i=0;i<num.length;i++) {
	if(mh.containsKey(num[i])==true) {
		mh.put(num[i],mh.get(num[i])+1);
	}else {
		mh.put(num[i],1);
	}
}

	}

}
