package Graph;
import java.util.ArrayList;
import java.util.Scanner;
public class DFS {

	public static void dfs(ArrayList<Integer> []arr,int curr,int []visit) {
		visit[curr]=1;
		System.out.println(curr);
//		for(int i=0;i<arr[curr].size();i++) {
//			dfs(arr,arr[curr].get(i));
//		}
		
		for(int nb : arr[curr]) {
			if(visit[nb]==0) {
			dfs(arr,nb,visit);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//dfs---in any ordering also called euler traversing.
		
ArrayList<Integer>[]adj = new ArrayList[6];
Scanner s =new Scanner(System.in);
for(int i=0;i<adj.length;i++) {
	adj[i]=new ArrayList();
}
for(int i=0;i<6;i++) {
	int u=s.nextInt();
	int v=s.nextInt();
	adj[u].add(v);
	adj[v].add(u);
}
int []visited = new int[6];
//int count=0; --- used for the components count by how many call dfs functions;
for(int i=0;i<visited.length;i++) {
	if(visited[i]==0) {
//		count++;
		dfs(adj,i,visited);
	}
}
//System.out.println(count);
//dfs(adj,0,visited);
	}

}
