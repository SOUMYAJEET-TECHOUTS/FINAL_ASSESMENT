package assessment;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		        ArrayList<String> list = new ArrayList<>();
		        list.add("Soumya");
		        list.add("Jeet");
		        list.add("Das");
   
		        Iterator<String> iterator = list.iterator();
		        while (iterator.hasNext()) {
		            String name = iterator.next();
		            System.out.println(name);
		            
		        }
		    }
		
	}


