package heap_priority_queues;
import java.util.*;

//always use that store more so that access more information etc.
class myCmp implements Comparator<Integer>{
	@Override
	public int compare(Integer o1 ,Integer o2){
		if(o1>=o2) {
			return -1;
		}else {
			return 1;
		}
	}
}

public class sorting_heap {
public static void heapsort(int []arr) {
	PriorityQueue<Integer>pq = new PriorityQueue(new myCmp());
	for(int i=0;i<arr.length;i++) {
		pq.add(arr[i]);
	}
	int index=0;
	while(pq.size()>0) {
		arr[index++]=pq.remove();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {10,1,2,1,4,2,6};

heapsort(arr);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}

}
