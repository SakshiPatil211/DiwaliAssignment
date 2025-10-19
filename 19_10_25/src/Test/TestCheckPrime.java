//1.Check if a number is prime 	
//Input: Integer n 
//Output: True if prime, False otherwise 

package Test;

import java.util.Scanner;

public class TestCheckPrime {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		boolean status = CheckPrime(n);
		if(status) {
			System.out.println(n + " is prime");
		}else {
			System.out.println(n + " is not prime");
		}
		
		sc.close();
	}
	
	//check prime or not
	private static boolean CheckPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
