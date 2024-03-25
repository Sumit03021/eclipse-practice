package Priority_queue;
import java.util.*;
public class in_built {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Integer>pq = new PriorityQueue();
pq.add(120);
pq.add(134);
pq.add(145);
pq.add(560);
pq.add(342);

System.out.println(pq.peek());
System.out.println(pq.remove());
System.out.println(pq);
while(pq.size()>0) {
	System.out.println(pq.remove());
}
	}

}
