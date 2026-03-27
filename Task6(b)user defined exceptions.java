import java.util.Scanner;
// User-defined Exception
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
 super(message);
 }
}
public class UserDefinedException {
             }
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try {
System.out.print("Enter age: ");
int age = sc.nextInt();
if (age < 18) {
throw new InvalidAgeException("Age must be 18 or above");
}
} catch (InvalidAgeException e) {
System.out.println("InvalidAgeException: " + e.getMessage());
}
sc.close();
}
