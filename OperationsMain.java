package assessment;

public class OperationsMain {

	public static void main(String[] args) {
		
		        Operations op = new Operations();

		        double num1 = 7.0;
		        double num2 = 5.0;

		        double resultPlus = op.calculate(num1, num2, Operations.PLUS);
		        double resultMinus = op.calculate(num1, num2, Operations.MINUS);
		        double resultDivide = op.calculate(num1, num2, Operations.DIVIDE);
		        double resultMultiply = op.calculate(num1, num2, Operations.MULTIPLY);

		        System.out.println("Result of " + num1 + " + " + num2 + " = " + resultPlus);
		        System.out.println("Result of " + num1 + " - " + num2 + " = " + resultMinus);
		        System.out.println("Result of " + num1 + " / " + num2 + " = " + resultDivide);
		        System.out.println("Result of " + num1 + " * " + num2 + " = " + resultMultiply);
		    }
	     }