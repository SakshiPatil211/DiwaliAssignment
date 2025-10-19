package Test;

import java.util.Scanner;

public class TestFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to calculate factorial");
		int n = sc.nextInt();
		
		int fact1 = FindFactorial(n);
		System.out.println("Factorial of "+ n + " is " + fact1);
		
		sc.close();
	}
	
	//factorial of given number
	private static int FindFactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact * i;
		}
		return fact;
	}

}
