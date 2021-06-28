/**
 * Valid Last Name with first letter starting with capital and has minimum 3 characters in it.
 *
 * @author: SAYANI KOLEY
 * @since: 28.06.2021
 */

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println(firstName("Tom"));
        System.out.println(firstName("Harry"));
        System.out.println(lastName("Hanks"));
        System.out.println(lastName("Abc"));
    }
    // validate first name
    public static boolean firstName( String firstName ) {
        return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
    }
    // validate first name
    public static boolean lastName( String firstName ) {
        return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
    }
}
