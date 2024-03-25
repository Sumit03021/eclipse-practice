package Graph;
import java.util.*;
public class Graph3 {

	ArrayList<Integer>[]arr;
	Graph3(int m){
		arr=new ArrayList[m];
		for(int i=0;i<m;i++) {
			arr[i]=new ArrayList();
		}
	}
	
	void addEdges(int u,int v) {
		arr[u].add(v);
		arr[v].add(u);
	}
	
	void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+"--> ");
			for(int j=0;j<arr[i].size();j++) {
				System.out.print(arr[i].get(j)+", ");
			}
			System.out.println();
		}
	}
}
