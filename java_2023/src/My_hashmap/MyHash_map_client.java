package My_hashmap;
public class MyHash_map_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//loading factor---no of item per arr.length---in which as small as possible loading factor(0.75)
MyHash_map mh=new MyHash_map();
mh.put("Mohan", 45);
mh.put("Sohan",67);
mh.put("Rahul", 16);
mh.put("Lokesh", 36);
mh.put("Vikas", 46);
mh.put("Sumit", 76);
mh.put("Kumar", 86);
mh.display();
// amortized time complexity---average time complexity--O(1)--worst O(n).
	}

}
