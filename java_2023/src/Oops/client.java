package Oops;

public class client {
public static void swap(test a,test b) {
	test temp=a;   // test temp=a
	a=b;             //a=b
	b=temp;           //b=temp;
}
// no change due to chnage in stack memory not in heap memory remember.
//call only refernce object but not persisted.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
test obj1=new test(12);
test obj2=new test(13);
System.out.println(obj1.a+ " , " +obj2.a);
swap(obj1,obj2);
System.out.println(obj1.a+ " , " +obj2.a);
	}

}
