package Assignment2;

public class problem2 {
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
		return c;
	}
	public void mul(int a, int b)
	{
		System.out.println("The result is = " + a*b);
	}
	public int div(int a, int b)
	{
		int c;
		c=a/b;
		return c;
	}
	public static void main(String[] args)
	{
		problem2 expression = new problem2();
		int divresult = expression.div(10,2);
		int sumresult = expression.sum(divresult,2);
		int subresult1 = expression.sub(sumresult,2);
		int subresult2 = expression.sub(subresult1,2);
		System.out.println("Expression is ((((10/2)+2)-2)-2)*2)");
		expression.mul(subresult2,2);
	}
}
