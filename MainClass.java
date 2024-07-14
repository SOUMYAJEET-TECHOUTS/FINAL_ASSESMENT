package assessment;

public class MainClass {
	    public static void main(String[] args) {
	      
	        Test addition = new Test() {
	            @Override
	            public int operate(int a, int b) {
	                return a + b;
	            }
	        };
	        int result = addition.operate(4, 8);
	        System.out.println("Result of addition: " + result);
	    }
	}


