package Test;

import java.util.Scanner;

public class TestArmstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		boolean status = checkArmstrong(num);
		
		if(status) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
		sc.close();
	}

	private static boolean checkArmstrong(int num) {
		int original = num;
		int arm = num;
		int power = 0;
		
		while(num!=0) {
			num = num / 10;
			power = power + 1;
		}
		double sum =0;
		while(original !=0) {
			int digit = original %10;
			sum = sum + Math.pow(digit,power);
			original = original/10;
		}
		
		if(arm == sum) {
			return true;
		}else {
			return false;
		}
	}

}
