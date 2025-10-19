//4.Generate Fibonacci series up to n terms 
//Input: Integer n 
//Output: First n Fibonacci numbers 

package Test;

import java.util.Scanner;

public class TestFibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number upto which fibonacci want");
		int n = sc.nextInt();
		
		fibonacci(n);
		sc.close();
				
	}
	
	//fibonacci upto nth term
	private static void fibonacci(int n) {
		int a = 0;
		int b = 1;
		
		for(int i=1;i<=n;i++) {
			System.out.print(a+ " ");
			int c= a+b;
			a=b;
			b=c;
		}
//		if(n==1) {
//			System.out.print(a+"\t");
//		}
//		
//		if(n==2) {
//			System.out.println(a + " " + b);
//		}
//
//		if(n>2) {
//			System.out.print(a + " " + b + " ");
//			for(int i=2;i<n;i++) {
//				int c = a + b;
//				System.out.print(c + " ");
//				a=b;
//				b=c;
//			}
//		}
	}

}
