package Graph;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
public class BFS {

public static void bfs(ArrayList<Integer>[]arr,int curr,int []visited) {
	LinkedList<Integer>q = new LinkedList();
	q.addLast(curr);
	visited[curr]=1;
	while(q.size()>0) {
		int curr_node = q.removeFirst();
		System.out.println(curr_node);
		for(int nb:arr[curr_node]) {
			if(visited[nb]==0) {
				visited[nb]=1;
				q.add(nb);
			}
		}
	}
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
for(int i=1;i<10;i++) {
	if(visited[i]==0) {
		bfs(arr,i,visited);
	}
}
	}

}
