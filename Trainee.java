package assessment;
import java.util.Set;
public class Trainee {
	
  private String name;
  private Set<Enrollment> enrollments;
  private Set<String> course;

	    public Trainee(String name) {
	        this.name = name;
	      
	    }

	    public String getName() {
	        return name;
	    }
	    

	    public  Set<String> getcourse(){
	    	return course;
	    }
	    public void setcourse(Set<String> course){
	    	this.course = course;
	    }
	    public Set<Enrollment> getEnrollments() {
	        return enrollments;
	    }

	    public void setEnrollments(Set<Enrollment> enrollments) {
	        this.enrollments = enrollments;
	    }

	    
	    public void addEnrollment(Enrollment enrollment) {
	        enrollments.add(enrollment);
	    }

	    public void removeEnrollment(Enrollment enrollment) {
	        enrollments.remove(enrollment);
	    }
	}

