package assessment;

public class Main2 {

	public static void main(String[] args) {


		        Trainee trainee1 = new Trainee("Soumya");
		        Trainee trainee2 = new Trainee("Shivam");


		        StudyMaterial material1 = new StudyMaterial("Java Basics");
		        StudyMaterial material2 = new StudyMaterial("Advance Java");

	
		        Enrollment enrollment1 = new Enrollment(trainee1, material1);
		        Enrollment enrollment2 = new Enrollment(trainee1, material2);
		        Enrollment enrollment3 = new Enrollment(trainee2, material2);
		        
		        System.out.println(trainee1.getName() + "'s enrolled materials:");
		        for (Enrollment enrollment : trainee1.getEnrollments()) {
		            System.out.println("- " + enrollment1.getStudyMaterial().getTitle());
		        }
		        System.out.println(trainee2.getName() + "'s enrolled materials:");
		        for (Enrollment enrollment : trainee2.getEnrollments()) {
		            System.out.println("- " + enrollment2.getStudyMaterial().getTitle());
		        }
		    }
	
	}

