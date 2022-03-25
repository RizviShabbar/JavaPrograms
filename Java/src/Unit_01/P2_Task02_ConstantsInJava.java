package Unit_01;
//constant can never change once a value is assigned
public class P2_Task02_ConstantsInJava {
	public static final double pi = 3.14;
	//pi = 3.18;
	public static void main(String[] args) {
		System.out.println(pi);
		main("askbdfhksd");
		
		NewClass obj = new NewClass();
		obj.add(1,2);
	}
	
	public static void main(String args) {
		System.out.println(pi);
	}
	
	void add(int a,int b) {
		System.out.println(a+b);
		System.out.println(pi);
	}
}

class NewClass{
	//final double pi = 3.14;
	void add(int a,int b) {
		System.out.println(a+b);
		System.out.println(P2_Task02_ConstantsInJava.pi);
      }
}
