package hashmap_question;
import java.util.*;
public class count_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []num = {1,2,1,3,4,5,4,1};
HashMap<Integer,Integer>mh=new HashMap();
for(int i=0;i<num.length;i++) {
	if(mh.containsKey(num[i])==true) {
		mh.put(num[i],mh.get(num[i])+1);
	}else {
		mh.put(num[i],1);
	}
}
int count=0;
for(Integer key:mh.keySet()) {
	if(mh.get(key)>1) {
		int count1= mh.get(key);
		count1= (count1*(count1-1))/2; 
		count=count + count1;
	}
}
System.out.println(count);
	}

}
