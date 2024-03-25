package Oops;

public class client2 {
public static void swap(test t1,test t2) {
	int temp=t1.a;
	t1.a=t2.a;
	t2.a=temp;
}
//now change due to referenced inside value change.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test obj1=new test(12);
		test obj2=new test(13);
		System.out.println(obj1.a+ " , " +obj2.a);
		swap(obj1,obj2);
		System.out.println(obj1.a+ " , " +obj2.a);
	}

}
