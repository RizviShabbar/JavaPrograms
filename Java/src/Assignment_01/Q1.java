package Assignment_01;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		System.out.println("Shabbar Rizvi_G_20011875");
		
	Scanner obj = new Scanner(System.in);
	Student[] obj1 = new Student[6];
	for(int i = 0 ; i < 6 ; i++) {
		System.out.println("enter the details of "+(i+1)+" student");
		System.out.println("enter the name of student");
		String name = obj.next();
		System.out.println("enter the age of student");
		byte age = obj.nextByte();
		System.out.println("enter the percentage of student");
		int percentage = obj.nextInt();
		obj1[i] = new Student(name,age,'A',percentage);
		}
		System.out.println("the average percentage of student is "+(float)Student.avg/6);
		obj.close();
	}	
}
class Student{
	static int avg = 0;
	String name;
	byte age;
	char section;
	int percentage;
	Student(String N,byte Age,char s,int Percentage){
		name = N;
		age = Age;
		section = s;
		percentage = Percentage;
		avg = avg + Percentage;	
	}
}