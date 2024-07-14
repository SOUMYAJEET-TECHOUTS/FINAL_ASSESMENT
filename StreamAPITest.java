package assessment;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class StreamAPITest {

	public static void main(String[] args) {
		
		        List<Integer> numbers = new ArrayList<>();
		        numbers.add(12);
		        numbers.add(5);
		        numbers.add(7);
		        numbers.add(9);
		        numbers.add(3);

		        long count = numbers.stream().count();

		        int sum = numbers.stream().mapToInt(Integer::intValue).sum(); 

		        OptionalDouble average = numbers.stream().mapToDouble(Integer::doubleValue).average(); 

		        int min = numbers.stream().mapToInt(Integer::intValue).min().orElse(Integer.MIN_VALUE); 

		        int max = numbers.stream().mapToInt(Integer::intValue).max().orElse(Integer.MAX_VALUE);

		        System.out.println("Numbers: " + numbers);
		        System.out.println("Count: " + count);
		        System.out.println("Sum: " + sum);
		        System.out.println("Average: " + (average.isPresent() ? average.getAsDouble() : "N/A"));
		        System.out.println("Min: " + min);
		        System.out.println("Max: " + max);
		    }
		}