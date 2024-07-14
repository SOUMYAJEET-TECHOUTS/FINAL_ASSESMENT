package assessment;

 class Operations {

	    public static final String PLUS = "plus";
	    public static final String MINUS = "minus";
	    public static final String DIVIDE = "divide";
	    public static final String MULTIPLY = "multiply";

	    public double calculate(double num1, double num2, String operation) {
	        switch (operation) {
	            case PLUS:
	                return num1 + num2;
	            case MINUS:
	                return num1 - num2;
	            case DIVIDE:
	                return num1 / num2;
	            case MULTIPLY:
	                return num1 * num2;
	            default:
	                throw new AssertionError("Invalid operation: " + operation);
	        }
	    }
	}
