package assessment;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class EmployeeReverseMain {

	public static void main(String[] args) {

		        List<EmployeeReverse> emp = new ArrayList<>();
		        emp.add(new EmployeeReverse("Soumyajeet", 4.5, 2024));
		        emp.add(new EmployeeReverse("Shivam", 4.6, 2024));
		        emp.add(new EmployeeReverse("Sachin", 4.3, 2023));

		        emp.sort(Comparator.comparing(EmployeeReverse::getRating).reversed()
		                                   .thenComparingInt(EmployeeReverse::getStartYear).reversed());
  
		        System.out.println("Employees sorted by rating in desending order:");
		        for (EmployeeReverse emps : emp) {
		            System.out.println(emps);
		        }
		    }

	}


