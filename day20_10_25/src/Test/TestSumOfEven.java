package Test;

import java.util.Scanner;

public class TestSumOfEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		
		int sum = SumOfNEven(n);
		System.out.println("\nSum of first " + n +" Even is "+ sum);
	}

	private static int SumOfNEven(int n) {
		int sum = 0;
		
		for(int i=1;i<=n*2;i++) {
			if(i%2==0) {
				System.out.print(i + " ");
				sum = sum + i;
			}
		}
		return sum;
	}

}
