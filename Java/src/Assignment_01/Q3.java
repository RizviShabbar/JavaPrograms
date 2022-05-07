package Assignment_01;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		System.out.println("Shabbar Rizvi_G_20011875");
		
		Scanner obj1 = new Scanner(System.in);
		System.out.println("enter the number");
		int num = obj1.nextInt();
		testClass obj = new testClass();
		obj.display(num);
		obj1.close();
	}
}
interface in1{
	void display(int p);
}
class testClass implements in1{
	public void display(int p) {
		int ctr = 0;
		for(int i = 1 ; i <= p/2 ; i++) {
			if(p%i==0) {
				ctr++;
			}
		}
		if(ctr==1)
			System.out.println(p+" is a prime number");
		else
			System.out.println(p+" is not a prime number");
	}
}
