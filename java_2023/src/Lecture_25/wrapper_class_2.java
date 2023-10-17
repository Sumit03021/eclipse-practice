package Lecture_25;

public class wrapper_class_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer d=12;
Integer e=12;
Integer d1=300;
Integer e1=300;
if(d==e) {// compare addresses----same (-128 to 127) due to Integer Cache
	//create pool(Integer cache)
	System.out.println("same");
}else {
	System.out.println("not same");
}
if(d1==e1) {
	System.out.println("same");
}else {
	System.out.println("not same");
}
	}

}
