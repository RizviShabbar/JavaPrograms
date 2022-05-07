package Assignment_01;

public class Q2 {
	public static void main(String[] args) {
		System.out.println("Shabbar Rizvi_G_20011875");
		
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();
		A obj4 = new A();
		
		
		obj1.call();
		obj2.call();
		obj3.call();
		obj4.call();
		
		System.out.println("the total no.of calls is "+A.counter);
	}
}
class A{
	static int counter = 0;
	void call(){
		counter ++;
	}
}