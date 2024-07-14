package assessment;

public class ExceptionHandlingTest {

	public static void main(String[] args) {
	
		        int result = testMethod();
		        System.out.println("Returned result: " + result);
		    }

		    public static int testMethod() {
		        try {
		       
		            int[] arr = new int[7];
		            System.out.println(arr[10]); 

		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		            return 1; 
		        } catch (ArithmeticException e) {
		            System.out.println("Caught ArithmeticException: " + e.getMessage());
		            return 2; 
		        } 
		        
		        finally
		        {
		            System.out.println("Inside finally block");
		            return 4; 
		        }
		        
		    }
}  



