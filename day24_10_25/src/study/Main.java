package study;

public class Main {

	public static void main(String[] args) {
		
		try {
			int result1 = Calculator.calculate(6,2 ,"+");
			System.out.println("Addition Result "+ result1);
			
			int result2 = Calculator.calculate(6,2 ,"-");
			System.out.println("Addition Result "+ result2);
			
			int result3 = Calculator.calculate(6,2 ,"@");
			System.out.println("Addition Result "+ result3);
			
		}catch(WrongOperatorException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
