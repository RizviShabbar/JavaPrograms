package Assignment_01;
import java.util.Scanner;
public class Q10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Car[] obj = new Car[4];
		for(int i=0;i<4;i++) {
			switch(i) {
				case 0:System.out.println("\nEnter details for Delhi : ");
						break;
				case 1:System.out.println("\nEnter details for Mumbai : ");
					break;
				case 2:System.out.println("\nEnter details for Chennai : ");
					break;
				case 3:System.out.println("\nEnter details for Kolkata : ");
					break;
			}
		    obj[i] = new Car();
			System.out.print("Enter number of Maruti K-10 : ");
			int k = in.nextInt();
			
			System.out.print("Enter number of Zen Astelo : ");
			int a = in.nextInt();
			
			System.out.print("Enter number of Wagon : ");
			int w = in.nextInt();
			
			System.out.print("Enter number of Maruti SX4 : ");
			int s = in.nextInt();
			obj[i].count(k,a,w,s);
		}
		in.close();
		
		System.out.println();
		System.out.println("Total number of Maruti K-10 sold : "+Car.K1);
		System.out.println("Total number of Zen Astelo sold  : "+Car.A1);
		System.out.println("Total number of Wagon sold       : "+Car.W1);
		System.out.println("Total number of Maruti SX4 sold  : "+Car.S1);
	}
}

class Car{
	static int K1;
	static int A1;
	static int W1;
	static int S1;
	void count(int k10,int astelo,int wagon,int sx4) {
		K1 += k10;
		A1 += astelo;
		W1 += wagon;
		S1 += sx4;
	}
}
