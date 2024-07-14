package assessment;

public class Enrollment {
	    private Trainee trainee;
	    private StudyMaterial studyMaterial;
	   
	    public Enrollment(Trainee trainee, StudyMaterial studyMaterial) {
	        this.trainee = trainee;
	        this.studyMaterial = studyMaterial;
	   
	        trainee.addEnrollment(this);
	        studyMaterial.addEnrollment(this);
	    }

	 
	    public Trainee getTrainee() {
	        return trainee;
	    }

	    public void setTrainee(Trainee trainee) {
	        this.trainee = trainee;
	    }

	    public StudyMaterial getStudyMaterial() {
	        return studyMaterial;
	    }

	    public void setStudyMaterial(StudyMaterial studyMaterial) {
	        this.studyMaterial = studyMaterial;
	    }

	    
	}

