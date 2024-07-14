package assessment;
import java.util.Optional;
public class OperationalMethodTest {

	public static void main(String[] args) {

		        Optional<String> optionalValue = Optional.of("How Are You");

		
		        if (optionalValue.isPresent()) {
		            System.out.println("Value is present: " + optionalValue.get());
		        } else {
		            System.out.println("Value is not present");
		        }

		      
		        Optional<String> emptyOptional = Optional.empty();

		      
		        String defaultValue = emptyOptional.orElse("Default Value");
		        System.out.println("Default Value: " + defaultValue);

		      
		        optionalValue.ifPresent(value -> System.out.println("Length of value: " + value.length()));
		    }
		}

