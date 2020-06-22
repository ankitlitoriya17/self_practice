package Assignment2;
public class problem1 {
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
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		return c;
	}
	public void div(int a, int b)
	{
		System.out.println("The result is = " + a/b);
		
	}
	public static void main(String[] args)
	{
		problem1 expression = new problem1();
		int sumresult1 = expression.sum(10,2);
		int sumresult2 = expression.sum(sumresult1,2);
		int subresult = expression.sub(sumresult2,2);
		int mulresult = expression.mul(subresult,2);
		System.out.println("Expression is ((((10+2)+2)-2)*2)/2");
		expression.div(mulresult,2);
	}
}
