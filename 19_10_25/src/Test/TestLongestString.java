//Coding Challenges 
//1.You are given an array of strings. Your task is to determine the length of the longest string in the array. 

package Test;

public class TestLongestString {

	public static void main(String[] args) {
		String[] strarr = {"Sakshi", "Patil", "Testing", "Welcome"};
		
		//display all string in array
		for(int i=0;i<strarr.length;i++) {
			System.out.print(strarr[i] + " ");
		}
		
		//return the string in the array
		String str = findLongestString(strarr);
		if(str!=null) {
			System.out.println("\nLongest string in the array is " + str);
		}else {
			System.out.println("\nnot found");
		}
	}
	//longest string in the array
	private static String findLongestString(String[] strarr) {
		if(strarr.length == 0) {
			return null;
		}
		int max = strarr[0].length();
		String str1 = null;;
		for(int i=1;i<strarr.length;i++) {
			if(max < strarr[i].length()) {
				max = strarr[i].length();
				str1 = strarr[i];
			}
		}
		return str1;
	}

}
