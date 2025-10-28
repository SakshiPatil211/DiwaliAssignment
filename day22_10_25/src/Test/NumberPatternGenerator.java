package Test;

import java.util.Scanner;

public class NumberPatternGenerator {

    /**
     * Prints a Right Triangle Number Pattern.
     * Example (r=5):
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     */
    public static void printRightTriangle(int r) {
        System.out.println("\n--- Right Triangle Number Pattern ---");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /**
     * Prints a Pyramid Number Pattern (centered).
     * Example (r=5):
     * 1
     * 1 2 1
     * 1 2 3 2 1
     * 
     */
    public static void printPyramid(int r) {
        System.out.println("\n--- Pyramid Number Pattern ---");
        for (int i = 1; i <= r; i++) {
            
            // 1. Print leading spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  ");
            }
            
            // 2. Print ascending sequence (1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // 3. Print descending sequence (i-1 to 1)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }

    /**
     * Prints an Inverted Right Triangle Number Pattern.
     * Example (r=5):
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     *
     */
    public static void printInvertedRightTriangle(int r) {
        System.out.println("\n--- Inverted Right Triangle Number Pattern ---");
        // Loop from r down to 1
        for (int i = r; i >= 1; i--) { 
            // The number of elements printed is equal to the current row value 'i'
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (r): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }
        int rows = scanner.nextInt();
        
        System.out.println("\n--- Pattern Menu ---");
        System.out.println("1. Right Triangle Number Pattern");
        System.out.println("2. Pyramid Number Pattern");
        System.out.println("3. Inverted Right Triangle Number Pattern");
        System.out.print("Enter your choice (1, 2, or 3): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid choice. Please enter a number.");
            scanner.close();
            return;
        }
        int choice = scanner.nextInt();

        // The switch case now handles three options
        switch (choice) {
            case 1:
                printRightTriangle(rows);
                break;
            case 2:
                printPyramid(rows);
                break;
            case 3:
                printInvertedRightTriangle(rows);
                break;
            default:
                System.out.println("Invalid selection. Please choose 1, 2, or 3.");
                break;
        }

        scanner.close();
    }
}