package Graph_questions;
import java.util.*;
public class graph_is_tree_or_not {
public boolean dfs(ArrayList<Integer>[]adj,int src,int []visited,int parent) {
	visited[src]=1;
	for(int nb:adj[src]) {
		if(visited[nb]==0) {
			boolean curr_ans = dfs(adj,nb,visited,src);
			if(curr_ans==true) {
				return true;
			}
		}else {
			if(nb!=parent) {
				return true;
			}
		}
	}
	return false;
}

public boolean isTree(int n,int m,ArrayList<ArrayList<Integer>>edges) {
	ArrayList<Integer>[]adj = new ArrayList[n];
	for(int i=0;i<n;i++) {
		adj[i]=new ArrayList();
	}
	for(int i=0;i<m;i++) {
		int u=edges.get(i).get(0);
		int v = edges.get(i).get(1);
		adj[u].add(v);
		adj[v].add(u);
	}
	int []visited =new int[n];
	int component =0;
	for(int i=0;i<n;i++) {
		if(visited[i]==0) {
			component++;
			boolean curr_ans = dfs(adj,i,visited,-1);
			if(curr_ans==true) {
				return false;
			}
		}
	}
	return component==1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
