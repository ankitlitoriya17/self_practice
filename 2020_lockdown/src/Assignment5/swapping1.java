package Assignment5;

public class swapping1 {
	
	public void swapping_without_variable(int a, int b) {
		System.out.println("Before swapping values are :"+"\n"+"A="+a +"\n"+ "B="+b);
		a= a+b;
		b= a-b;
		a=a-b;
		System.out.println("After swapping values are :"+"\n"+"A="+a +"\n"+ "B="+b);
	}
	
	public void swap_using_3_variables()
	{
		int a = 10;
		int b = 20;
		System.out.println("Two given variables are :"+"\n"+"A="+a +"\n"+ "B="+b);
		
		int c;
		c=a;
		a=b;
		b=c;
		
		System.out.println("Value of given variables after swapping with the help of third variable :"+"\n"+ "A="+a+"\n"+"B="+b);
	}
	
	public static void main (String[] args) {
		
		swapping1 swap = new swapping1();
		swap.swap_using_3_variables();
		swap.swapping_without_variable(15,20);
	}

}
