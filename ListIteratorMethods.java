package assessment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods {
	
	public static void main(String[] args) {
		
		       
		        List<String> names = new ArrayList<>();
		        names.add("Soumya");
		        names.add("Shivam");
		        names.add("Sachin");

		        System.out.println("Using Iterator:");
		        Iterator<String> iterator = names.iterator();

		        while (iterator.hasNext()) {
		            String name = iterator.next();
		            System.out.println(name);
		        }

		        
		        iterator = names.iterator();
		        while (iterator.hasNext()) {
		            String name = iterator.next();
		            if (name.equals("Sachin")) {
		                iterator.remove();
		            }
		        }

		        System.out.println("After removing 'Sachin': " + names);

		        List<Integer> numbers = new ArrayList<>();
		        numbers.add(5);
		        numbers.add(3);
		        numbers.add(2002);

		        System.out.println("\nUsing ListIterator:");
		        ListIterator<Integer> listIterator = numbers.listIterator();

		        while (listIterator.hasNext()) {
		            int num = listIterator.next();
		            System.out.println("Next element: " + num + ", Next index: " + listIterator.nextIndex());
		        }

		        listIterator.add(2003);
		        System.out.println("After adding 2003: " + numbers);

		        while (listIterator.hasPrevious()) {
		            int num = listIterator.previous();
		            if (num == 2002) {
		                listIterator.set(7); 
		            } else if (num == 2003) {
		                listIterator.remove();
		            }
		            System.out.println("Previous element: " + num + ", Previous index: " + listIterator.previousIndex());
		        }

		        System.out.println("After updating and removing elements: " + numbers);
		    }
		}
