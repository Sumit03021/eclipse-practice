package inbuilt_hashmap;
import java.util.*;
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Integer>mh=new HashMap();
mh.put("rohan",34);
mh.put("rohit",78);
mh.put("mohit",56);
System.out.println(mh);
mh.put(null,72);// store as null;
mh.put("mohit",46);// update--due to key are unique in nature.
System.out.println(mh);
System.out.println(mh.containsKey("sohan"));//check contains or not
System.out.println(mh.get("mohan"));// give value of key or null.
System.out.println(mh.getOrDefault("sohan", -1));//check if has then give otherwise that value.
for(String key: mh.keySet()) {
	System.out.print(key+" "+mh.get(key)+" ");
}

System.out.println(mh.keySet());











	}

}
