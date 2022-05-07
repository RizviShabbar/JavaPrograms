package Assignment_01;

public class Q7 {
	public static void main(String[] args) {
		System.out.println("Shabbar Rizvi_G_20011875");
		
		A1 obj1 = new A1();
		A1 obj2 = new A1();
		A1 obj3 = new A1();
		A1 obj4 = new A1();
		
		
		obj1.display();
		obj2.display();
		obj3.display();
		obj4.display();
		
		System.out.println("the total no.of calls is "+A1.counter);
	}
}
class A1{
	static int counter = 0;
	void display(){
		counter ++;
	}
}
