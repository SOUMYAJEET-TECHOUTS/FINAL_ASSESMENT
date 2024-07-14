package assessment;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class FilterIntegerDoubleValue {
public static void main(String[] args) {

	        IntConsumer printConsumer = num -> System.out.println("Doubled Value Output: " + (num * 2));

	        IntStream.rangeClosed(1, 10)
	                .forEach(printConsumer);
	    }
}