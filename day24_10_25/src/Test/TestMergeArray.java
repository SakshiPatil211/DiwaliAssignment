package Test;

public class TestMergeArray {

	public static void main(String[] args) {
		int[] num1 = {5,6,7,8,9};
		int[] num2 = {1,2,3,4};
		
		int[] resultarr = mergeArary(num1,num2); 
		
		System.out.println("Mergeed array");
		for(int num :resultarr) {
			System.out.print(num + " ");
		}
	}

	private static int[] mergeArary(int[] num1, int[] num2) {
		int n1 = num1.length;
		int n2 = num2.length;
		
		int result[] = new int[n1+n2];
		
		int i=0, j= 0,k=0;
		
		//compare elements of the both the array
		while(i<n1 && j<n2) {
			if(num1[i] <= num2[j]) {
				result[k] = num1[i];
				k++;
				i++;
			}else {
				result[k] = num2[j];
				k++;
				j++;
			}
		}
		
		//remaining num1 array elements
		while(i<n1) {
			result[k] = num1[i];
			k++;
			i++;
		}
		
		//remaining num2 array elements
		while(j<n2) {
			result[k] = num2[j];
			k++;
			j++;
		}
		
		return result;
	}

}
