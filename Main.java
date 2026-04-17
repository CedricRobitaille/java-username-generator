import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String firstName = sc.nextLine().trim();
      String lastName = sc.nextLine().trim();

      String username = firstName + lastName;

      // 2 options:

      // Option 1:
      // Get chars from name,
      // convert char array to string
      // char[] initialChars = {firstName.charAt(0), lastName.charAt(0)};
      // String initials = new String(initialChars);

      // Option 2:
      // Grab the substrings of the first letters.
      String initials = firstName.substring(0, 1) + lastName.substring(0, 1);
      

      System.out.println("Username: " + username);
      System.out.println("Initials: " + initials);
  }
}