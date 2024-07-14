package assessment;
import java.util.List;
public class Main {

	public static void main(String[] args) {

                Company company = new Company("Techouts Forward");
		  
		        Employee emp1 = new Employee("Soumyajeet", 4.3, 2024);
		        Employee emp2 = new Employee("Shivam", 4.4, 2024);
		        Employee emp3 = new Employee("Sachin", 4.2, 2023);
		        
		        company.addEmployee(emp1);
		        company.addEmployee(emp2);
		        company.addEmployee(emp3);
		     
		        List<Employee> employees = company.getEmployees();
		        
		  
		        for (Employee emp : employees) {
		        	System.out.println("Company Name: " + company.getName());
		            System.out.println("Employee Name: " + emp.getName());
		            System.out.println("Employee Rating: " + emp.getRating());
		            System.out.println("Employee Start Year: " + emp.getStartYear());
		            System.out.println("----------------------");
		        }
		    }
		
	}

