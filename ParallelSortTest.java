package assessment;
import java.util.Arrays;
public class ParallelSortTest {

	public static void main(String[] args) {

		        int[] numbers = {5, 3, 8, 1, 10};

		        Arrays.parallelSort(numbers);

		        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
		    }
}