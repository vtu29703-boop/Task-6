public class BuiltInExceptions {
                       public static void main(String[] args) {
// 1. ArrayIndexOutOfBoundsException
try {
int arr[] = {10, 20, 30};
System.out.println(arr[5]);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
}
// 2. StringIndexOutOfBoundsException
try {
String str = "JAVA";
System.out.println(str.charAt(10));
} catch (StringIndexOutOfBoundsException e) {
System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
}
// 3. NullPointerException
try {
String s = null;
System.out.println(s.length());
} catch (NullPointerException e) {
System.out.println("NullPointerException: " + e.getMessage());
}
// 4. NumberFormatException        }
}
try {
String value = "ABC123";
int num = Integer.parseInt(value);
System.out.println(num);
} catch (NumberFormatException e) {
System.out.println("NumberFormatException: " + e.getMessage());
}
