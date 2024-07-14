package assessment;
import java.util.StringJoiner;
public class StringJoinnerTest {

	public static void main(String[] args) {
	
		        StringJoiner sj = new StringJoiner(", ", "{", "}");

		        sj.add("Grapes");
		        sj.add("Apple");
		        sj.add("Mango");

		        String fruits = sj.toString();

		        System.out.println("Fruits are: " + fruits);
		    }
		}
