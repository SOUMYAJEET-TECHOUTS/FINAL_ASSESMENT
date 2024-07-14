package assessment;

import java.io.IOException;

public class EmployeeMain2 {

	public static void main(String[] args) throws IOException {
		        EmployeeTest2 emp = new EmployeeTest2("Soumyajeet", 23, "Devloper");
		        emp.writeDetailsToFile("employee_details1.txt");
		        
		    }
		
	}


