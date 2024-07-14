package assessment;
 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
 
public class DateOperation {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Prompt user to enter a date
        System.out.print("Enter a date (yyyy-MM-dd HH:mm:ss): ");
        String inputDateTimeString = scanner.nextLine().trim();
 
        // Validate and perform operations
        if (isValidDateTimeFormat(inputDateTimeString)) {
            // Parse input string to LocalDateTime
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime inputDateTime = LocalDateTime.parse(inputDateTimeString, formatter);
 
            // Check if input date is earlier than present date
            if (isEarlierThanPresent(inputDateTime)) {
                System.out.println("Input date is earlier than present date.");
            } else {
                System.out.println("Input date is not earlier than present date.");
            }
 
            // Check if input date is after present date
            if (isAfterPresent(inputDateTime)) {
                System.out.println("Input date is after present date.");
            } else {
                System.out.println("Input date is not after present date.");
            }
 
            // Convert given date to "yyyy-MM-dd HH:mm:ssZ" pattern
            String convertedDateTime = convertToPattern(inputDateTime);
            System.out.println("Converted DateTime: " + convertedDateTime);
        } else {
            System.out.println("Invalid date format. Please enter date in yyyy-MM-dd HH:mm:ss format.");
        }
 
        scanner.close();
    }
 
    // Method to check if input date is earlier than present date
    private static boolean isEarlierThanPresent(LocalDateTime inputDateTime) {
        LocalDateTime presentDateTime = LocalDateTime.now();
        return inputDateTime.isBefore(presentDateTime);
    }
 
    // Method to check if input date is after present date
    private static boolean isAfterPresent(LocalDateTime inputDateTime) {
        LocalDateTime presentDateTime = LocalDateTime.now();
        return inputDateTime.isAfter(presentDateTime);
    }
 
    // Method to convert given date to "yyyy-MM-dd HH:mm:ssZ" pattern
    private static String convertToPattern(LocalDateTime inputDateTime) {
        DateTimeFormatter formatterWithZ = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX");
        return inputDateTime.format(formatterWithZ);
    }
 
    // Method to validate date-time format
    private static boolean isValidDateTimeFormat(String dateTimeString) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime.parse(dateTimeString, formatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
 