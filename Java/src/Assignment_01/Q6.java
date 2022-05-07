package Assignment_01;
import java.util.Scanner;
public class Q6 {
	public static void main(String[] args) {
		System.out.println("Shabbar Rizvi_G_20011875");
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the value of a and b");
		int a = obj.nextInt();
		int b = obj.nextInt();
		Calculator obj1 = new Calculator();
		boolean bool = (a>b) ? true : false ;
		if(bool == true) {
			int sum = obj1.Sum(a,b);
			System.out.println("sum is "+sum);
		}
		else {
			int sub = obj1.Sub(a, b);
			System.out.println("sub is "+sub);
		}
		obj.close();	
	}
}
class Calculator{
	int Sum(int a,int b) {
		int sum;
		sum = a+b;
		return sum;
	}
	int Sub(int a,int b) {
		int sub;
		sub = a-b;
		if(sub<0) {
			return 0;
		}
		else
			return sub;
	}
}
