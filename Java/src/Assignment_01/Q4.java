package Assignment_01;

public class Q4 {
	public static void main(String[] args) {
		System.out.println("Shabbar Rizvi_G_20011875");
		ClassThree obj = new ClassThree();
		//ClassThree obj = new ClassThree(1);
		obj.display();
	}
}
class ClassOne{
	ClassOne(int x){
		System.out.println("this is constructor with single parameter in class one");
	}
}
class ClassTwo extends ClassOne{
	ClassTwo(){
		super(10);
		System.out.println("this is default constructor in class two");
	}
	
}
class ClassThree extends ClassTwo{
	ClassThree(){
		System.out.println("this is default constructor in class three");
	}
	ClassThree(int q){
		System.out.println("this is single parameter constructor in class three");
	}
	void display() {
		System.out.println("we are in display method");
	}
}