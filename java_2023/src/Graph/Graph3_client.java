package Graph;
import java.util.*;
public class Graph3_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Graph3 gn =new Graph3(6);
Scanner s= new Scanner(System.in);
int m =s.nextInt();
for(int i=0;i<m;i++) {
	int u=s.nextInt();
	int v=s.nextInt();
	gn.addEdges(u, v);
}
gn.display();
	}

}
