/**
 * Valid First Name with first letter starting with capital and has minimum 3 characters in it.
 *
 * @author: SAYANI KOLEY
 * @since: 28.06.2021
 */

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println(firstName("Tom"));
        System.out.println(firstName("Harry"));
    }
    // validate first name
    public static boolean firstName( String firstName ) {
        return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
    }
}
