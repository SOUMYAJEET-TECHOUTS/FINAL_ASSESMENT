package assessment;
public class EmployeeReverse {
	
	 private String name;
	    private double rating;
	    private int startYear;

	    
	    public EmployeeReverse(String name, double rating, int startYear) {
	        this.name = name;
	        this.rating = rating;
	        this.startYear = startYear;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getRating() {
	        return rating;
	    }

	    public int getStartYear() {
	        return startYear;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" + "name='" + name + '\'' + ", rating=" + rating +
	               ", startYear=" + startYear +'}';
	               
	    }
	
	}

