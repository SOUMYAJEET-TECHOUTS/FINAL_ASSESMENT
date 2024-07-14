package assessment;
import java.util.HashSet;
import java.util.Set;

public class StudyMaterial {
	
	    private String title;
	    private Set<Enrollment> enrollments;
	    public StudyMaterial(String title) {
	        this.title = title;
	        this.enrollments = new HashSet<>();
	    }

	   
	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
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
	


