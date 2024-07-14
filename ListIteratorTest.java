package assessment;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		
		 
		        ArrayList<String> list = new ArrayList<>();
		        list.add("Soumya");
		        list.add("Jeet");
		        list.add("Das");

		       
		        ListIterator<String> listIterator = list.listIterator();
		        while (listIterator.hasNext()) {
		            String name = listIterator.next();
		            System.out.println(name);
		        }

		        
		        listIterator.add("Kumar");

		        
		        System.out.println("Iterating backwards:");
		        while (listIterator.hasPrevious()) {
		            String name = listIterator.previous();
		            System.out.println(name);
		        }
		    }
		
	}

