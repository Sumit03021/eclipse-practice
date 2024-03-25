package interface_demo;
import java.util.*;
interface MyComparator{
	public int MyCompare(Integer val1,Integer val2);
}
class Increase implements MyComparator{
	public int MyCompare(Integer val1,Integer val2) {
		if(val1>val2) {
			return 1;
		}else {
			return -1;
		}
	}
}
class Decrease implements MyComparator{
	public int MyCompare(Integer val1,Integer val2) {
		if(val1<val2) {
			return 1;
		}else {
			return -1;
		}
	}
}
public class demo2 {
public static void bubbleSort(ArrayList<Integer>arr, MyComparator obj) {
	for(int i=0;i<arr.size();i++) {
		for(int j=0;j<arr.size()-i-1;j++) {
			if(obj.MyCompare(arr.get(j), arr.get(j+1))>0) {
				int temp = arr.get(j);
				arr.set(j,arr.get(j+1));
				arr.set(j+1, temp);
			}
		}
	}
}
public static void main(String []args) {

ArrayList<Integer>arr=new ArrayList<>();
arr.add(23);
arr.add(100);
arr.add(101);
arr.add(45);
arr.add(92);
arr.add(67);

bubbleSort(arr,new Increase());
System.out.println(arr);
bubbleSort(arr,new Decrease());
System.out.println(arr);
}
}
