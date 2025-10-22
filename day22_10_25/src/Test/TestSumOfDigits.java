package Test;

import java.util.Scanner;

public class TestSumOfDigits {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enetr the number");
		int n = sc.nextInt();
		
		int sum = sumOfDigits(n);
		System.out.println("Sum of digits " + n + " is " + sum);
		sc.close();
	}

	private static int sumOfDigits(int n) {
		int sum = 0;
		while(n!=0) {
			int rem = n%10;
			sum = sum + rem;
			n=n/10;
		}
		return sum;
	}

}
