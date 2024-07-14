package assessment;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class FilterIntegerTest {

	public static void main(String[] args) {

		        IntConsumer cr = System.out::println;
		        IntStream.rangeClosed(1, 10)
		                
		                .filter(num -> num < 3 || num > 7)
		                .forEach(cr);
		    }
	}

