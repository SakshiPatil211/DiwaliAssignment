package study;

class WrongOperatorException extends Exception{
	public WrongOperatorException(String msg) {
		super(msg);
	}
}
public class Calculator {
	
	public static int calculate(int num1, int num2, String op) throws WrongOperatorException{
		switch(op) {
			case "+" ->{
				return num1 + num2;
			}
			
			case "-" ->{
				return num1 - num2;
			}
			
			case "*" ->{
				return num1 - num2;
			}
			
			case "/" ->{
				if(num2 == 0) {
					throw new ArithmeticException("Division by zero is not allowed");
				}
				return num1 / num2;
			}
			
			case "%" ->{
				return num1 % num2;
			}
			
			default->{
				throw new WrongOperatorException("Invalid operator " + op);
			}
		}
	}
}
