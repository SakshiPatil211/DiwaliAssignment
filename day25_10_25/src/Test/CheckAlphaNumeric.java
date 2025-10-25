package Test;

import java.util.Scanner;

public class CheckAlphaNumeric {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isAlphanumeric(input)) {
            System.out.println("The string contains only alphanumeric characters.");
        } else {
            System.out.println("The string contains non-alphanumeric characters.");
        }

        sc.close();
	}

	private static boolean isAlphanumeric(String input) {
		return input.matches("[A-Za-z0-9]+");
	}

}
