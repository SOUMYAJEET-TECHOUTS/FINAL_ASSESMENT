package assessment;
import java.util.*;
public class TreeSetTest {

	public static void main(String[] args) {

		        TreeSet<String> treeSet = new TreeSet<>();

		        treeSet.add("mango");
		        treeSet.add("Banana");
		        treeSet.add("Orange");
		        treeSet.add("Dragonfruit");
		        treeSet.add("TOMATO");
		        treeSet.add("Cherry");
		        treeSet.add("Kiwi");
		        treeSet.add("onion");
		        
		        System.out.println("Elements of TreeSet:");
		        for (String element : treeSet) {
		            System.out.println(element);
		        }
		   }
	
	}


