package Test;

import java.util.Scanner;

public class RotateArrayByKSteps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {2,5,6,8,9};
		
		System.out.println("enter steps to rotate by right");
		int k = sc.nextInt();
		
		rotateArray(arr,k);
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		sc.close();

	}

	private static void rotateArray(int[] arr, int k) {
		int len = arr.length;
		k = k % len;
		
		//reverse whole array
		reverse(arr,0,len-1);
		
		//reverse first k elements
		reverse(arr,0,k-1);
		
		//reverse remaining elements
		reverse(arr,k,len-1);
	}

	private static void reverse(int[] arr, int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}	
	}
}