package My_hashmap;
import java.util.*;
public class MyHash_map {
LinkedList<Entry> []arr;
private int count = 0;
private double load_factor = 0.75;
MyHash_map(){
	arr=new LinkedList[5];
	for(int i=0;i<arr.length;i++) {
		arr[i]=new LinkedList();
	}
}

int hashfunction(String key) {
	int hash_value=Math.abs(key.hashCode());
	int index=hash_value%arr.length;
	return index;
}

public boolean isContainsKey(String key) {
	int index=hashfunction(key);
	for(int i=0;i<arr[index].size();i++) {
		if(arr[index].get(i).key.equals(key)) {
			return true;
		}
	}
	return false;
}

public void put(String key, int val) {
	int index = hashfunction(key);
	if(isContainsKey(key)==true) {
		for(int i=0;i<arr[index].size();i++) {
			if(arr[index].get(i).key.equals(key)) {
				arr[index].get(i).value=val;
			}
		}
	}else {
		count++;
		Entry ele=new Entry(key,val);
		arr[index].addFirst(ele);
	}
	double curr_load_factor = (double)count/arr.length;
	if(curr_load_factor>load_factor) {
		rehashing();
	}
}
public void rehashing() {
	LinkedList <Entry>[]old_arr = arr;
	arr = new LinkedList[2*old_arr.length];
	for(int i=0;i<arr.length;i++) {
		arr[i]=new LinkedList();
	}
	for(int i=0; i< old_arr.length;i++) {
		for(int j=0;j<old_arr[i].size();j++) {
			put(old_arr[i].get(j).key,old_arr[i].get(j).value);
		}
	}
}

public void remove(String key) {
	int index =hashfunction(key);
	if(isContainsKey(key)==true) {
		for(int i=0;i<arr[index].size();i++) {
			if(arr[index].get(i).key.equals(key)) {
				arr[index].remove(i);
			}
		}
	}
}
public int get(String key) throws Exception {
	int index =hashfunction(key);
	if(isContainsKey(key)==true) {
		for(int i=0;i<arr[index].size();i++) {
			if(arr[index].get(i).key.equals(key)) {
				return arr[index].get(i).value;
			}
		}
		return -1;
	}else {
	throw new Exception("key is not found");
}
}

public void display() {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].size();j++) {
			System.out.print("{"+arr[i].get(j).key+" "+arr[i].get(j).value+"}");
		}
		System.out.println();
	}
}
}
