package Graph;
import java.util.*;
public class Graph {

	int [][]edgeList;
	Scanner s = new Scanner(System.in);
	//m is no of edges
	Graph(int m){
		edgeList = new int[m][2];
		for(int i=0;i<m;i++) {
			int u=s.nextInt();
			int v=s.nextInt();
			edgeList[i][0]=u;
			edgeList[i][1]=v;
		}
	}
	void display() {
		for(int i=0;i<edgeList.length;i++) {
			System.out.println(edgeList[i][0]+","+edgeList[i][1]);
		}
	}
	
}
