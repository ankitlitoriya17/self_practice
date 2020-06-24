package Assignment7;

public class student {

	public student()
	{
		this(1,2);
		System.out.println("No Parent");
	}
	public student(int a) {
		this(1,2,3);
		System.out.println("One Parent");
	}
	public student(int a, int b) {
		this(2);
		System.out.println("Two Parent");
	}
	
	public student(int a, int b, int c) {
		
		System.out.println("Three Parent");
	}



}
