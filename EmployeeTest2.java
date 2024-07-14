package assessment;
import java.io.*;
public class EmployeeTest2 {
	
	    private String name;
	    private int age;
	    private String department;

	   
	    public EmployeeTest2(String name, int age, String department) {
	        this.name = name;
	        this.age = age;
	        this.department = department;
	    }

	   
	    public void writeDetailsToFile(String fileName) throws IOException {
	      
	        FileWriter f= new FileWriter(fileName);
	        BufferedWriter b = new BufferedWriter(f);

	       
	        b.write("Name: " + name);
	        b.newLine();
	        b.write("Age: " + age);
	        b.newLine();
	        b.write("Department: " + department);
	        b.newLine();

	        b.close();
	        f.close();
	       
	        File file = new File(fileName);
	        file.setReadOnly();

	        System.out.println("Employee details written to file: " + fileName);
	        System.out.println("This File Only Readable");
	        System.out.println("This File Cannot be Editable");
	    }
	}
