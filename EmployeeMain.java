package assessment;
import java.io.IOException;

public class EmployeeMain {

	public static void main(String[] args) throws IOException {
		
		        EmployeeTestMain emp = new EmployeeTestMain();
		        Manager manager = new Manager();

		        emp.createFile("test.txt");

		        emp.writeFile("test.txt", "Welcome");

		        manager.readFile("test.txt");

		        manager.deleteFile("test.txt");
		    }
		
	}

