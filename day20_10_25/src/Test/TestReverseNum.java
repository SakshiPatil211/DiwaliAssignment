package Test;

import java.util.Scanner;

public class TestReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int rev = reverseNo(num);
		System.out.println("Reverse number of "+ num + " is " + rev);
	} 

	private static int reverseNo(int num) {
		int rev = 0;
		while(num!=0) {
			int rem = num % 10;
			rev = rev*10 + rem;
			num = num / 10;
		}
		return rev;
	}

}
