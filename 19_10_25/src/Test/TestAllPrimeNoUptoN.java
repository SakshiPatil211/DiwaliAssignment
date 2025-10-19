package Test;
import java.util.Scanner;

public class TestAllPrimeNoUptoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		System.out.println("Prime numbers upto "+ n + " are ");
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+ "\t");
			}
		}
		
		sc.close();
	}

	//prime numbers upto n
	private static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
