package Assignment3;

public class constructor {
	public constructor()
	{
		this(1,2,3);
		System.out.println("Default constructor");
	}
	public constructor(int a)
	{
		this();
		System.out.println("One parameterized constructor");
	}
	public constructor(int a, int b)
	{
		this(1);
		System.out.println("Two parameterized constructor");
	}
	public constructor(int a, int b, int c)
	{
		System.out.println("Three parameterized constructor");
	}
	
	public static void main (String[] args)
	{
		constructor a = new constructor(1,2);
	}

}
