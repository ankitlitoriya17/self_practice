package Assignment5;

import java.util.Scanner;

public class primenumber {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Provide a number to find whether it is Prime or not :");
		Scanner s = new Scanner(System.in);
		int input= s.nextInt();
		int flag =0;
		for(int a= 2;input>a;a++)
		{
			if(input % a == 0) {
				System.out.println("Given number "+ input +" is not a Prime number");
				flag =1;
				break;
			}

		}
		if(flag == 0)
	System.out.println("Given number "+input+" is a Prime Number");

	}

}
