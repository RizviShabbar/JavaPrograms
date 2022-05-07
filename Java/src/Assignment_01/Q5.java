package Assignment_01;
import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
		System.out.println("Shabbar Rizvi_G_20011875");
		
		Scanner obj = new Scanner(System.in);
		
		Employee[] obj1 = new Employee[8];
		for(int i = 0; i < 8 ;i++) {
			System.out.println("enter the details of "+(i+1)+" employee");
			System.out.println("enter the name");
			String name = obj.next();
			System.out.println("enter the age of employee");
			int age = obj.nextInt();
			System.out.println("enter the department of an employee");
			String department = obj.next();
			System.out.println("enter the salary of an employee");
			long salary = obj.nextLong();
			obj1[i] = new Employee(name,age,department,salary);
		}
		obj.close();
		for(int i = 0;i<8;i++) {
			System.out.println("Name is :"+obj1[i].name);
			System.out.println("age is :"+obj1[i].age);
			System.out.println("department is :"+obj1[i].d1);
			System.out.println("salary is :"+obj1[i].salary);
			System.out.println();
		}
	}
}
class Employee{
	String name;
	int age;
	String d1;
	long salary;
	
	Employee(String Name,int Age,String D1,long Salary){
		name = Name;
		age = Age;
		d1=D1;
		if(Salary>30000) {
			salary = 25000;
		}
		else {
			salary = Salary;
		}
		
	}
}
