package Assignment5;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Which Number Table you want :");
		Scanner s = new Scanner(System.in);
		final int input = s.nextInt();
		System.out.println("Table for "+input+" is below :");
		for(int a=1;a<=10;a++) {
			int i = input*a;
			System.out.println(i);
		}

	}

}
