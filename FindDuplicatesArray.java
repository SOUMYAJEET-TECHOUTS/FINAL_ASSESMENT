package assessment;
import java.util.*;
public class FindDuplicatesArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,4,5,7,7,7,7,7,8,8,8,10};

		        Map<Integer, Integer> map = new HashMap<>();
		        
		        
		        for (int num : arr) {
		            if (map.containsKey(num)) {
		                map.put(num, map.get(num) + 1); 
		            } else {
		                map.put(num, 1); 
		            }
		        }
		       
		        System.out.println("Duplicates in the array:");
		        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		            if (entry.getValue() > 1) {
		                System.out.println(entry.getKey() + " - Count: " + entry.getValue());
		            }
		        }
		    }
	}


