package Test;

import java.util.Scanner;

public class TestPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		
		boolean status = checkPalindrome(num);
		if(status) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

	private static boolean checkPalindrome(int num) {
		int original = num;
		int rev=0;
		while(num!=0) {
			int rem = num % 10;
			rev = rev*10 + rem;
			num = num/10;
		}
		
		if(original == rev) {
			return true;
		}else {
			return false;
		}
	}

}
