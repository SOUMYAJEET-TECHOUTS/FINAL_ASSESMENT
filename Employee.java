package assessment;

public class Employee {
    private String name;
    private double rating;
    private int startYear;
    
    public Employee(String name,double rating, int startYear) {
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
    	public void setName(String name) {
            this.name = name;
        }
        
        public void setRating(int rating) {
            this.rating = rating;
        }
        
        public void setStartYear(int startYear) {
            this.startYear = startYear;
        }
    }
	


