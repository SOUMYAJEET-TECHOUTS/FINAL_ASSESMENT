package assessment;
import java.util.Scanner;

public class InvalidUserNameMain {

	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

		        try {
		          
		            System.out.print("Enter your username (must be <= 10 characters and not contain '&'): ");
		            String userName = scanner.nextLine();

		           
		            if (userName.length() > 10 || userName.contains("&")) {
		                throw new InvalidUserName("Invalid username: Please Use Less Than 10 Characters and cannot contain '&'");
		            }

		           
		            System.out.println("Username is valid: " + userName);

		        } 
		        catch (InvalidUserName e) {
		           
		            System.out.println("Error: " + e.getMessage());
		        }
		        finally
		        {
		            scanner.close();
		        }
		    }

	}

