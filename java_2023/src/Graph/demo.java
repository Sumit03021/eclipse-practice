package Graph;

public class demo {
// tree ---atmost only one parent.
// tree --- never talk about cycle creations
// tree -- have N nodes resulted (n-1) edges only but graph have more than that edges number of tree.

//graph ---network of vertexes /nodes.
//graph ---mathematically just a set of ordered vertices and edges.

//type of graphs
//1. undirected graph--bidirectional graph ((1,20,(2,1),(1,3),(3,1))
//2. directed graph	((1,2),(1,3))
//3. weighted graph --- directed/undirected graph --- -ve and +ve both exists
//4. unweighted graph --- does not have weighted --- 
	
// properties of graph
// 1. self loop---refresh webpage and whatsapp self account message.
// 2. parallel edge--- multiple connectivity
// 3. simple graph --- does not have self loop and parallel edges. (90-95% cases)
	
//---------directed graph------
// maximum edges -- n(n-1);
// minimum edges -- 0;
// 0 <= |E| <= n(n-1)
	
// --------undirected graph------
// maximum edges -- n(n-1)/2;
// minimum edges -- 0;
//	0 <= |E| <= n(n-1)/2	
	
// path --- sequence of vertices from one node to another node without repeatition of any nodes/edges.
//{(1,2),(2,5),(5,4),(3,4),(1,3),(3,6),(1,6)}
// cycle -- closed path such that starting and ending vertices is same.
// (1,2,4,1) is cycle but (6,1,4,2,1,3,6) not cycle due intermediate repeated.

	
// issues of cycle
// 1. infinite looping
// 2. dependent graph --- dependency in cyclic 

// connected graph --- the path from any vertex to other vertex (undirected--connected but directed graph is strongly connected graph)
// disconnected graph --- path does not exists from one to other vertex. -- inside it called connected component --- part /sub part of connected part graphs.

// ---question 1 max components for n nodes with minimum components
//answer 1 --- n component and 1 component 

// question 2 --- minimum edges required to make connected graph (n nodes)
// answer 2 --- n-1 edges 

// acyclic connected graph --- if n-1 edges and no cycle in graph --- that can be make tree.

// degree of undirected graph (nodes/vertex degree) --- number of edges check direct neighbours

//degree of directed graph ---
// 2 type indegree (comes) and outdegree(out) self loop (count in both in out degree directed but 2 count in undirected graph)

// questions 3 n nodes and E edges (undirected)
// answer 3 total degree --- 2E
	
// question 4 n nodes E edges x nodes degree sum is even then prove that remining nodes degree sum always even.
// answer 4 total degree always is even.
	
// ----input format of graph------
// 1. edge list ke respect mein
int [][]edgeList = new int[10][2];	
// tense graph -- max edges --- time O(n2) and inputs (n2)
// find all adjacent nodes --- time O(n2)


// 2. adjacent matrix format----
// 0 and 1 if present 1 else 0 (direct edge);
int [][]matrix = new int[10][10];
// time O(1) search
// adjacent neighbours time O(n)
// but limit access store 10 power 5

// 3. adjacent list format
// array of linkedlist / array of arraylist -- only check connected then added
// 1:{2,4}
//2:{1,4,3,5}
//3:{2,5,6}
//4:{1,2,5}
//5:{2,4,3,6}
//6:{3,5}
// time search O(degree of vertex)
// adjacent neighbours time O(degree of vertexes)









}
