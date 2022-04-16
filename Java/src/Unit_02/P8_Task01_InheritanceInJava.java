package Unit_02;

/*
 - extends keyword 
 
 - Subclass 
 - SuperClass 
 - "Code Re-usability"
 
 class derived-class-name "extends" base-class 
 {
 	// method and fields 
 }
  
  Types of Inheritance :
  - Single inheritance
  - Multilevel Inheritance
  - Multiple Inheritance: "Java doesn't support multiple inheritance with classes"
   -It handles this feature by implementing more than one interface instead of extending more than one class 
  - Hierarchical Inheritance(Tree) - Yes
  - Hybrid Inheritance  - No 
  
  - Constructor calls flow in inheritance 
  	- Default constructor 
  	- Parameterized constructor 
 */
public class P8_Task01_InheritanceInJava {
		public static void main(String[] args){
			
			Three g = new Three();
			g.methodOne();
			g.methodTwo();
			
	g.methodThree();

			Two two = new Two(1);
			D obj = new D(2);
			obj.methodFour();
			
		}
	}

	class One{
		
		int a;
		
		One(int x){
			System.out.println("One Constructor!");
		}
		
		public void methodOne() {
			System.out.println("First Method!");
		}
	}

	class Two extends One{
		
		int b;
		
		Two(int x){
			super(3);
			b = x;
			System.out.println("Two Constructor!");
		}
		
		public void methodTwo() {
			System.out.println("Second Method!");
		}
	}

	class Three extends Two{
		
		int c;
		
		Three(){
			super(1);
			System.out.println("Three Constructor!");
		}
		
		Three(int x){
			super(1);
			c = x;
			System.out.println("Three Constructor!");
		}
		
		public void methodThree() {
			System.out.println("Three Method!");
		}
	}

	class A{
		int a;
		
		A(int a1){
			a = a1;
		}
		
		public void methodOne() {
			System.out.println(a);
		}
	}

	class B extends A{
		int b;
		
		B(int x){
			super(10);
			b = x;
		}
		
		public void methodTwo() {
			System.out.println(b);
		}
	}

	class C extends A{
		int c;
		
		C(){
			super(10);
			c = 10;
		}
		
		public void methodThree() {
			System.out.println(c);
		}
	}

	class D extends C{
		int d;
		
		D(int d1){
			super();
			d = d1;
		}
		
		public void methodFour() {
			System.out.println(d);
		}
}
