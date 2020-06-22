package Assignment3;

public class practice{
	
	public practice(int a)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*a);
		}
	}

	public static void main(String[] args)
	{
		practice a = new practice(2);
	}
}
