package Test;

import java.util.Scanner;

public class TestAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr first number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		
		int sum = addition(n1,n2);
		
		System.out.println("Sum of "+ n1 + " + "+ n2 + " is "+ sum);
	}

	private static int addition(int n1, int n2) {
		
		return n1+n2;
	}

}
