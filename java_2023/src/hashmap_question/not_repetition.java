package hashmap_question;
import java.util.*;
public class not_repetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {1,1,2,2,0,1,3,3,4,4,4};
HashMap<Integer,Integer>mh=new HashMap();
for(int i=0;i<arr.length;i++) {
  if(mh.containsKey(arr[i])==true) {
	  mh.put(arr[i],mh.get(arr[i])+1);
  }else {
	  mh.put(arr[i],1);
  }
}
for(Integer key:mh.keySet()) {
	if(mh.get(key)==1) {
		System.out.println(key);
	}
}
	}

}
