package Test;

import java.util.Scanner;

public class TestGCDLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the 2nd number");
		int n2 = sc.nextInt();
		
		int gcd = findGCD(n1,n2);
		
		System.out.println("GCD of " + n1 + "," + n2 + " is " + gcd);
		
		int lcm = findLCM(n1,n2,gcd);
		System.out.println("LCM of " + n1 + "," + n2 + " is " + lcm);

		sc.close();

	}

	private static int findLCM(int n1, int n2, int gcd) {
		return (n1*n2)/gcd;
	}

	private static int findGCD(int n1, int n2) {
		for(int i = Math.min(n1, n2);i>0;i--) {
			if(n1%i == 0 && n2%i == 0) {
				return i;
			}
		}
		return 1;
	}

}
