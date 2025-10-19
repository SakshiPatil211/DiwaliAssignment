package Test;

import java.util.Scanner;

public class TestCheckEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		boolean status = checkEvenOdd(n);
		if(status) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		sc.close();
	}
	
	
	//check prime or not
	private static boolean checkEvenOdd(int n) {
		if(n%2==0) {
			return true;
		}
		return false;
	}

}
