package assessment;
import java.io.*;
public class EmployeeTestMain {
	
	    void createFile(String fileName) throws IOException {
	        File file = new File(fileName);
	        if (file.createNewFile()) {
	            System.out.println("File created: " + file.getName());
	        }
	        else {
	            System.out.println("File already exists.");
	        }
	    }

	    void readFile(String fileName) throws IOException {
	        BufferedReader reader = new BufferedReader(new FileReader(fileName));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        reader.close();
	    }

	    void writeFile(String fileName, String content) throws IOException {
	        FileWriter writer = new FileWriter(fileName);
	        writer.write(content);
	        writer.close();
	        System.out.println("Successfully wrote to the file.");
	    }
	}

	class Manager extends EmployeeTestMain {
	    
	    @Override
	    void createFile(String fileName) throws IOException {
	        super.createFile(fileName); 
	    }

	    @Override
	    void readFile(String fileName) throws IOException {
	        super.readFile(fileName); 
	        
	    }

	    @Override
	    void writeFile(String fileName, String content) throws IOException {
	        super.writeFile(fileName, content); // Call superclass method
	        
	    }

	   
	    void deleteFile(String fileName) {
	        File file = new File(fileName);
	        if (file.delete()) {
	            System.out.println("Deleted the file: " + file.getName());
	        } else {
	            System.out.println("Failed to delete the file.");
	        }
	    }
	}

	

