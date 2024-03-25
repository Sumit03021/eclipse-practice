package interface_demo;
import java.util.*;
class cmp implements Comparator<Integer>{
	
	public int compare(Integer val1,Integer val2) {
		if(val1%10<val2%10) {
			return -1;// not swapping
		}else {
			return 1;//swapping
		}
	}
	
}
public class demo1 {

	public static void bubbleSort(ArrayList<Integer>arr,cmp obj) {
		for(int i=0;i<arr.size();i++) {
			for(int j=0;j<arr.size()-i-1;j++) {
				if(obj.compare(arr.get(j), arr.get(j+1))>0) {
					int temp = arr.get(j);
					arr.set(j,arr.get(j+1));
					arr.set(j+1, temp);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>arr=new ArrayList<>();
arr.add(23);
arr.add(100);
arr.add(101);
arr.add(45);
arr.add(92);
arr.add(67);
cmp obj = new cmp();
Collections.sort(arr,obj);
System.out.println(arr);
	}

}
