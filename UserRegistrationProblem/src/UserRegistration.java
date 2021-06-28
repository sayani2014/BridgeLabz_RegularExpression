/**
 * Check valid password
 * Rule 1: minimum 8 characters
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

        email();
        phoneNumber();
        password();
    }
    // validate first name
    public static boolean firstName( String firstName ) {
        return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
    }
    // validate first name
    public static boolean lastName( String firstName ) {
        return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
    }
    //validate given email
    public static void email() {
        String email = "abc.xyz@bl.co.in";
        String regex = "^[a-z]{3}[a-zA-Z0-9+_.-]*@[a-z]{2}[.]{1}[a-z]{2}[.][a-z]*$";
        boolean result = email.matches(regex);
        if(result) {
            System.out.println("Given email-id is valid");
        } else {
            System.out.println("Given email-id is not valid");
        }
    }
    //validate given phone number
    public static void phoneNumber() {
        String phone = "91 9919819801";
        String regex = "[0-9]{2}[\s][0-9]{10}";
        boolean result = phone.matches(regex);
        if(result) {
            System.out.println("Given phone number is valid");
        } else {
            System.out.println("Given phone number is not valid");
        }
    }
    //validate given password
    public static void password() {
        String password = "abcd#123";
        String regex = "[A-Za-z0-9@_#$%!]{8,}";
        boolean result = password.matches(regex);
        if(result) {
            System.out.println("Given password is valid");
        } else {
            System.out.println("Given password is not valid");
        }
    }
}
