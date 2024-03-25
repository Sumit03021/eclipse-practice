package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Shortest_Path {

	public static int bfs(ArrayList<Integer>[]arr,int src,int des,int []visited) {
		LinkedList<Pair>q = new LinkedList();
		q.addLast(new Pair(src,0));
		visited[src]=1;
		while(q.size()>0) {
			Pair rm = q.removeFirst();
			int curr_node = rm.val;
			int distance = rm.d;
//			System.out.println(curr_node);
			if(curr_node==distance) {
				return distance;
			}
			for(int nb:arr[curr_node]) {
				if(visited[nb]==0) {
					visited[nb]=1;
					q.add(new Pair(nb,distance+1));
				}
			}
		}
		return Integer.MAX_VALUE;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
ArrayList<Integer> []arr =new ArrayList[10];
for(int i=0;i<10;i++) {
	arr[i]=new ArrayList();
}
for(int i=0;i<n;i++) {
	int u=s.nextInt();
	int v=s.nextInt();
	arr[u].add(v);
	arr[v].add(u);
}
int []visited = new int[10];
int ans = bfs(arr,1,3,visited);
System.out.println(ans);
	}

}
