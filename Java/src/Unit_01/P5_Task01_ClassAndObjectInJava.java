package Unit_01;

public class P5_Task01_ClassAndObjectInJava {	
	public static void main(String[] args) {
		ABCD obj = new ABCD();
		//obj.display();
		
		ABCD.display();
		
		ABCD obj1 = new ABCD();
		obj1.display2();
	}
}

class ABCD{
	int a =8;
	static int b = 10;
	
	static void display() {
		
		int b = 15;
		b++;
		System.out.println(b);//16
	}
	 void display2()
	{
		System.out.println(a);//8
//		a was a local variable so we can't access it outside the method
		System.out.println(b);//10
		
	}
}
