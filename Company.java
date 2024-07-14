package assessment;
import java.util.ArrayList;
import java.util.List;

public class Company {
	
	    private String name;
	    private List<Employee> emp;
	    
	    public Company(String name) {
	        this.name = name;
	        this.emp = new ArrayList<>();
	    }
	  
	    public void addEmployee(Employee employee) {
	        emp.add(employee);
	    }
	    
	    public void removeEmployee(Employee employee) {
	        emp.remove(employee);
	    }
	    

	    public List<Employee> getEmployees() {
	        return emp;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	}

