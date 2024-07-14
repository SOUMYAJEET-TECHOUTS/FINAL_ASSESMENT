package assessment;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class CollecterTest {

	public static void main(String[] args) {

		        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		        List<Integer> doubledNumbers = numbers.stream()
		                .map(n -> n * 2)
		                .collect(Collectors.toList());

		        System.out.println("Doubled numbers: " + doubledNumbers);

	}
}