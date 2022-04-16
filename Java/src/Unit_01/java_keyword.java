package Unit_01;
/* 50 such keywords in java.
 * 48+2 in which 48 use and 2 for future use[goto*,const**].
 * 1.2v = assert**
 * 1.4v = strictfp***
 * 5.0v = enum****
 * keywords cannot be used as identifiers in java.
 * 1.object
 * 2.variable name
 * 3.function
 * 4.class etc.
 * -----VARIABLE IN JAVA----------.
 * 1.3 types of variable in java.
 * a.local,b.instance,c.static variable.
 * a.local=it is declared inside the body of the method.
 * b.instance=it is defined without the static keywords they are defined outside the method declaration.they are object specific 
 * that's why known as instance variable.
 * c.static = static keyword are define with a static keyword they are initialize only once at the start of the program execution.
 * the static variable should be initialize first just before initialization of any instance variable.
 * it is shared among all the object of that class.
 */
	public class java_keyword {
		public static void main(String[] args)
		{
			//variable name
			int double = 12;
			
			//function  name
			int double() {
				System.out.println();
				return 0;
			}
			
			ABC int = new ABC();
		}
	}
//class name can never be any keywords in java.
		class int{
			void display() {
				System.out.println("another class");
			}
		}
//object
		class ABC{
			void display() {
				System.out.println("another class");
//object name can never be any keywords in java.
			}
}

