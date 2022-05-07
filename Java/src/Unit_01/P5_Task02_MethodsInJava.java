package Unit_01;

public class P5_Task02_MethodsInJava {
	public static void main(String[] args) {
		ABCD1 obj = new ABCD1();
	ABCD1.display();
		System.out.println(ABCD1.a);
		obj.display2();
	}
}

class ABCD1{
	static int a = 15;
	/* 
	 Actual method definition
	 DataType methodName(DataType2 p1, DataType p2){
	 	methodBody;
	 	return value;  (if required)
	 */
	static void display() {
		int a = 11;
		int b = 12;
		System.out.println(a);
		System.out.println(b);
	}
	 void display2() {
//		System.out.println(b);
//		As b was a local variable so we can't access it outside the method
		System.out.println(a);
		
		//return a;
	}
}

