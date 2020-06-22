package Assignment_1;

public class Student {

	int age;
	int roll_no;
	
	public void method1()
	{
		System.out.println("Welcome All! My name is Ankit.");
	}
	
	public void method2()
	{
		System.out.println("Automation is very Easy.");
	}
	
	public static void main(String[] args)
	{
		Student Ankit = new Student();
		Ankit.method1();
		Ankit.age = 29;
		System.out.println("My age is = "+Ankit.age);
		Ankit.roll_no= 1712;
		System.out.println("My Roll number is = "+ Ankit.roll_no);
		Ankit.method2();
	}
}
