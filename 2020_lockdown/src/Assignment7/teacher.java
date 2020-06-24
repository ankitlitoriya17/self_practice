package Assignment7;

public class teacher extends student
{
	public teacher() {
		super();
		System.out.println("No child");
	}
	
	public teacher(int a) {
		this(1,2,3);
		System.out.println("One child");
	}
	
	public teacher(int a, int b) {
		this(12);
		System.out.println("Two child");
	}
	
	public teacher(int a, int b, int c) {
		this();
		System.out.println("Three child");
	}

	public static void main(String[] args) {
		teacher T = new teacher(11,22);
		}

}
