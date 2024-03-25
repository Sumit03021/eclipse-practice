package Graph;
import java.util.*;
public class Graph2_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Graph2 gh =new Graph2(6);
Scanner s= new Scanner(System.in);
int m =s.nextInt();
for(int i=0;i<m;i++) {
	int u =s.nextInt();
	int v = s.nextInt();
	gh.addEdges(u, v);
}
gh.display();
	}

}
