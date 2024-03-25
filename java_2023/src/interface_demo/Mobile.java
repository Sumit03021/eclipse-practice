package interface_demo;

public class Mobile {
int review;
int price;
String brand;
Mobile(int review,int price,String brand){
	this.review=review;
	this.price=price;
	this.brand=brand;
}
void show() {
	System.out.println(brand +" "+ price);
}
}
