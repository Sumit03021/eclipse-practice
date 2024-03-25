package heap_priority_queues;
import java.util.*;
public class min_heap {
ArrayList<Integer>arr;
// number--10power(5) solved in x iteration--equation 10(power(5))=2(power(x));
min_heap(){
	arr = new ArrayList();
}
public int peek() throws Exception{
	if(arr.size()==0) {
		throw new Exception("ArrayList is empty.");
	}
	return arr.get(0);
}
public int size() {
	return arr.size();
}
private int leftChildIndex(int pi) {
	int lci = 2*pi+1;
	return lci;
}
private int rightChildIndex(int pi) {
	int rci = 2*pi+2;
	return rci;
}
public void add(int val) {
	arr.add(val);
	upHeapify(arr.size()-1);
}

private int parentIndex(int ci) {
	int pi =(ci-1)/2;
	return pi;
}
private void upHeapify(int ci) {
	if(ci == 0) {
		return;
	}
	
	int pi = parentIndex(ci);
	if(arr.get(ci)<arr.get(pi)) {
		swap(ci,pi);
		upHeapify(pi);
	}
}
private void swap(int ci,int pi) {
	int temp = arr.get(pi);
	arr.set(pi,arr.get(ci));
	arr.set(ci,temp);
}

public void remove()throws Exception {
	if(arr.size()==0) {
		throw new Exception("ArrayList is already empty.");
	}
	swap(0,arr.size()-1);
	arr.remove(arr.size()-1);
	downHeapify(0);
}
private void downHeapify(int pi) {
	
	int mini = pi;
	int lci =leftChildIndex(pi);
	int rci =rightChildIndex(pi);
	//automatically handle base cases but can be write
	if(lci>=arr.size() && rci>=arr.size()) {
		return;
	}
	
	
	if(lci<arr.size() && arr.get(lci)<arr.get(mini)) {
		mini = lci;
	}
	if(rci<arr.size() && arr.get(rci)<arr.get(mini)) {
		mini = rci;
	}
	if(pi == mini) {
		return;
	}else {
		swap(mini,pi);
		downHeapify(mini);
	}
}
}
